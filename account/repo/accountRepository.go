package repo

import (
	"errors"
	"fmt"
	"reflect"

	common "github.com/bigdataconcept/account-service/common"
	domain "github.com/bigdataconcept/account-service/domain"
)

type AccountRepository interface {
	GetAccountById(id string) (*domain.Account, error)
	SaveEntity(entity interface{}) error
	GetAccountIdByAcctNumber(acctNumber string) (uint, error)
	Update(entity interface{}) error
	GetAccountByAcctNumber(acctNumber string) (*domain.Account, error)
	GetAllAccount() ([]*domain.Account, error)
	GetAllCreditCardsByAccountId(id string) ([]*domain.CreditCard, error)
	GetAddressByAccountId(id string) (*domain.Address, error)
	GetProfileByAccountId(id string) (*domain.Profile, error)
	GetAccountBalanceByAccountId(id string) (*domain.AccountBalance, error)
}

type AccountRepositoryImpl struct {
}

func (acctRepo AccountRepositoryImpl) GetAccountIdByAcctNumber(acctNumber string) (uint, error) {

	acct := domain.Account{}

	if common.DB.Where(&domain.Account{AccountNumber: acctNumber}).Find(&acct).Error != nil {
		return 0, errors.New(fmt.Sprintf("Account Not found with Account Number %s", acctNumber))
	}

	return acct.Model.ID, nil
}

func (acctRepo AccountRepositoryImpl) GetAccountById(id string) (*domain.Account, error) {

	acct := &domain.Account{}

	if common.DB.Where(&domain.Account{AccountNumber: id}).Find(acct).Error != nil {
		return nil, errors.New(fmt.Sprintf("Account Not found with Account Number %s", id))
	}
	return acct, nil

}

func (acctRepo AccountRepositoryImpl) GetAccountByAcctNumber(id string) (*domain.Account, error) {
	acct := &domain.Account{}
	if common.DB.Where(&domain.Account{AccountNumber: id}).Find(acct).Error != nil {
		return nil, errors.New(fmt.Sprintf("Account Not found with Account Number %s", id))
	}
	return acct, nil
}

func (acctRepo AccountRepositoryImpl) SaveEntity(entity interface{}) error {

	if common.DB.Create(&entity).Error != nil {
		v := reflect.TypeOf(entity)
		return errors.New(fmt.Sprintf("Unable to Save Entity %s", v))
	}
	return nil
}

func (acctRepo AccountRepositoryImpl) Update(entity interface{}) error {
	if common.DB.Update(&entity).Error != nil {
		v := reflect.TypeOf(entity)
		return errors.New(fmt.Sprintf("Unable to Update Entity %s", v))
	}
	return nil
}

func (acctRepo AccountRepositoryImpl) GetAllAccount() ([]*domain.Account, error) {

	accts := make([]*domain.Account, 0)
	if common.DB.Find(&accts).Error != nil {
		return nil, errors.New("Unable to find Accounts records")
	}
	return accts, nil

}

func (acctRepo AccountRepositoryImpl) GetAllCreditCardsByAccountId(id string) ([]*domain.CreditCard, error) {
	creditCard := make([]*domain.CreditCard, 0)
	acct := domain.Account{AccountNumber: id}
	if common.DB.Model(&acct).Related(creditCard).Error != nil {
		return nil, errors.New(fmt.Sprint("No Credits Card Found For Account Number %s", id))
	}

	return creditCard, nil
}

func (acctRepo AccountRepositoryImpl) GetAddressByAccountId(id string) (*domain.Address, error) {
	addr := &domain.Address{}

	acct := domain.Account{AccountNumber: id}

	if common.DB.Model(&acct).Related(addr).Error != nil {

		return nil, errors.New(fmt.Sprint("No Address Found For Account Number %s", id))

	}
	return addr, nil
}

func (acctRepo AccountRepositoryImpl) GetProfileByAccountId(id string) (*domain.Profile, error) {

	profile := &domain.Profile{}

	acct := domain.Account{AccountNumber: id}

	if common.DB.Model(&acct).Related(profile).Error != nil {

		return nil, errors.New(fmt.Sprint("No Profile Found For Account Number %s", id))

	}
	return profile, nil
}

func (acctRepo AccountRepositoryImpl) GetAccountBalanceByAccountId(id string) (*domain.AccountBalance, error) {

	acctBal := &domain.AccountBalance{}

	acct := domain.Account{AccountNumber: id}

	if common.DB.Model(&acct).Related(acctBal).Error != nil {

		return nil, errors.New(fmt.Sprint("No Account Balance Found For Account Number %s", id))

	}
	return acctBal, nil
}
