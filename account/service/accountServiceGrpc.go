package service

import (
	"context"
	"github.com/bigdataconcept/account-service/common"
	"github.com/bigdataconcept/account-service/repo"
	"github.com/bigdataconcept/account-service/domain"
	pb "github.com/bigdataconcept/account-service/stub/proto"
	"github.com/opentracing/opentracing-go"
)

/**
 @autor Oluwaseyi Otun
 This service is implemented using gRPC in GOLang. It responsible for creating and managing user account
**/

type AccountServiceGrpc struct {
	Tracer opentracing.Tracer
}

func (server *AccountServiceGrpc) AddAccount(ctx context.Context, acctRequest *pb.AddAccountRequest) (*pb.AddAccountReponse, error) {
	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	creditCard := domain.NewCreditCard(acctRequest.CreditCardInfo.CardNumber, acctRequest.CreditCardInfo.Cvc)
	address := domain.NewAAddress(acctRequest.AddressInfo.PostalCode, acctRequest.AddressInfo.Street, acctRequest.AddressInfo.City, acctRequest.AddressInfo.Province, acctRequest.AddressInfo.PhoneNumber, acctRequest.AddressInfo.Email)
	profile := domain.NewProfile(acctRequest.ProfileInfo.FirstName, acctRequest.ProfileInfo.Surname)
	creditCards := make([]*domain.CreditCard, 1)
	creditCards[0] = creditCard
	login := domain.NewLogin(acctRequest.LoginInfo.Username, acctRequest.LoginInfo.Password)
	account := domain.NewAccount(creditCards, address, profile, login)
	acctId, err := acctService.SaveAccount(account)
	defer db.Close()
	acctAddResponse := &pb.AddAccountReponse{AccountNumber: acctId}
	return acctAddResponse, err
}

func (server *AccountServiceGrpc) AddCreditCard(ctx context.Context, addCreditCardRquest *pb.AddCreditCardRequest) (*pb.AddCreditCardResponse, error) {
	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	creditCard := domain.NewCreditCard(addCreditCardRquest.CreditCardInfo.CardNumber, addCreditCardRquest.CreditCardInfo.Cvc)

	acctId, err := acctService.SaveCreditCard(creditCard, addCreditCardRquest.AccountNumber)
	defer db.Close()
	addCreditCardResponse := &pb.AddCreditCardResponse{AccountNumber: acctId}
	return addCreditCardResponse, err
}

func (server *AccountServiceGrpc) UpdateAddress(ctx context.Context, addAddressRequest *pb.AddresssUpdateRequest) (*pb.AddressUpdateResponse, error) {

	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	address := domain.NewAAddress(addAddressRequest.AddressInfo.PostalCode, addAddressRequest.AddressInfo.Street, addAddressRequest.AddressInfo.City, addAddressRequest.AddressInfo.Province, addAddressRequest.AddressInfo.PhoneNumber, addAddressRequest.AddressInfo.Email)
	acctId, err := acctService.updateAddress(address, addAddressRequest.AccountNumber)

	defer db.Close()
	addressUpdateResponse := &pb.AddressUpdateResponse{AccountNumber: acctId}
	return addressUpdateResponse, err
}

func (server *AccountServiceGrpc) UpdateProfile(ctx context.Context, profileUpdateRequest *pb.ProfileUpdateRequest) (*pb.ProfileUpdateResponse, error) {

	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	profile := domain.NewProfile(profileUpdateRequest.ProfileInfo.FirstName, profileUpdateRequest.ProfileInfo.Surname)

	accountId, err := acctService.updateProfile(profile, profileUpdateRequest.AccountNumber)
	defer db.Close()
	profileUpdateResponse := &pb.ProfileUpdateResponse{AccountNumber: accountId}
	return profileUpdateResponse, err
}

func (server *AccountServiceGrpc) GetAccountBalance(ctx context.Context, balanceRequest *pb.BalanceRequest) (*pb.BalanceResponse, error) {

	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	balance, err := acctService.FindAccountBalanceByAccountId(balanceRequest.AccountNumber)
	defer db.Close()
	balanceReponse := &pb.BalanceResponse{Balance: balance.Balance}
	return balanceReponse, err
}

func (server *AccountServiceGrpc) GetAllCreditCardsByAccount(ctx context.Context, creditCardRequest *pb.CreditCardsRequest) (*pb.CreditCardsResponse, error) {
	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	cardList, err := acctService.FindAllCreditCardsByAccountId(creditCardRequest.AccountNumber)
	cardLength := len(cardList)
	cardInfoList := make([]*pb.CreditCardInfo, cardLength)
	for i, card := range cardList {
		cardInfoList[i] = &pb.CreditCardInfo{CardNumber: card.CreditCardNumber, Cvc: card.Cvc}
	}
	creditCardReponse := &pb.CreditCardsResponse{CreditCards: cardInfoList}
	defer db.Close()
	return creditCardReponse, err
}

func (server *AccountServiceGrpc) GetProfileByAccount(ctx context.Context, profileRequest *pb.ProfileRequest) (*pb.ProfileResponse, error) {
	db := common.DB
	acctRepo := new(repo.AccountRepositoryImpl)
	acctService := &AccountService{AccountRepository: acctRepo}
	profile, err := acctService.FindProfileByAccountId(profileRequest.AccountNumber)
	profileInfo := &pb.ProfileInfo{FirstName: profile.FirstName, Surname: profile.LastName}
	profileResponse := &pb.ProfileResponse{ProfileInfo: profileInfo}
	defer db.Close()
	return profileResponse, err
}
