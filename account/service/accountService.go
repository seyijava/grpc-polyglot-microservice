package service


import(
	"github.com/bigdataconcept/account-service/domain"
    "github.com/bigdataconcept/account-service/repo")
	

type AccountService struct {
	AccountRepository repo.AccountRepository
}

func (acctService *AccountService) FindAccountById(id string) (*domain.Account, error) {
	return acctService.AccountRepository.GetAccountById(id)
}

func (acctService *AccountService) SaveAccount(account *domain.Account) (string, error) {

	return account.AccountNumber, acctService.AccountRepository.SaveEntity(account)
}

func (acctService *AccountService) updateProfile(profile *domain.Profile, acctNumber string) (string, error) {
	acctId, err := acctService.AccountRepository.GetAccountIdByAcctNumber(acctNumber)
	profile.AccountId = acctId
	err = acctService.AccountRepository.Update(profile)
	return acctNumber, err
}

func (acctService *AccountService) updateAddress(address *domain.Address, acctNumber string) (string, error) {
	acctId, err := acctService.AccountRepository.GetAccountIdByAcctNumber(acctNumber)
	address.AccountId = acctId
	err = acctService.AccountRepository.Update(address)
	return acctNumber, err
}

func (acctService *AccountService) SaveCreditCard(creditCard *domain.CreditCard, acctNumber string) (string, error) {
	acctId, err := acctService.AccountRepository.GetAccountIdByAcctNumber(acctNumber)
	creditCard.AccountId = acctId
	err = acctService.AccountRepository.SaveEntity(creditCard)
	return acctNumber, err
}

func (acctService *AccountService) DecreaseBalance(acctNumber string, amount float64) error {
	acct, err := acctService.AccountRepository.GetAccountByAcctNumber(acctNumber)
	acct.AccountBalance.Balance = acct.AccountBalance.Balance - amount
	err = acctService.AccountRepository.Update(acct)
	return err
}

func (acctService *AccountService) InecreaseBalance(acctNumber string, amount float64) error {
	acct, err := acctService.AccountRepository.GetAccountByAcctNumber(acctNumber)
	acct.AccountBalance.Balance = acct.AccountBalance.Balance + amount
	err = acctService.AccountRepository.Update(acct)
	return err
}

func (acctService *AccountService) FindAllAccounts() ([]*domain.Account, error) {
	return acctService.AccountRepository.GetAllAccount()
}

func (acctService *AccountService) FindAllCreditCardsByAccountId(id string) ([]*domain.CreditCard, error) {
	return acctService.AccountRepository.GetAllCreditCardsByAccountId(id)
}

func (acctService *AccountService) FindAddressByAccountId(id string) (*domain.Address, error) {
	return acctService.AccountRepository.GetAddressByAccountId(id)
}

func (acctService *AccountService) FindProfileByAccountId(id string) (*domain.Profile, error) {
	return acctService.AccountRepository.GetProfileByAccountId(id)
}

func (acctService *AccountService) FindAccountBalanceByAccountId(id string) (*domain.AccountBalance, error) {
	return acctService.AccountRepository.GetAccountBalanceByAccountId(id)
}

func (acctService *AccountService) FindAccountIdByAcctNumber(acctNumber string) (uint, error) {
	return acctService.AccountRepository.GetAccountIdByAcctNumber(acctNumber)
}
