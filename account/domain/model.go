package domain

import (
	"math/rand"
	"strings"
	"time"

	"github.com/bigdataconcept/account-service/common"
	"github.com/jinzhu/gorm"
)

const charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

var seededRand *rand.Rand = rand.New(
	rand.NewSource(time.Now().UnixNano()))

func StringWithCharset(length int, charset string) string {
	b := make([]byte, length)
	for i := range b {
		b[i] = charset[seededRand.Intn(len(charset))]
	}
	return strings.ToUpper(string(b))
}

func String(length int) string {
	return StringWithCharset(length, charset)
}

// An Entity that model Account Balance use to store customer balance
type AccountBalance struct {
	gorm.Model
	Balance   float64
	AccountId uint
}

/*An Entity that model Login*/
type Login struct {
	gorm.Model
	Username  string
	Password  string
	AccountId uint
}

/* An Entity that models  customer Addresss*/
type Address struct {
	gorm.Model
	Street      string
	PostalCode  string
	City        string
	Province    string
	PhoneNumber string
	Email       string
	AccountId   uint
}

/* An Entity that models CreditCard*/
type CreditCard struct {
	gorm.Model
	CreditCardNumber string
	ExpireDate       string
	Cvc              string
	AccountId        uint
}

// Profile model Entity

type Profile struct {
	gorm.Model
	FirstName string
	LastName  string
	AccountId uint
}

// Account Model
type Account struct {
	gorm.Model
	CreditCards    []*CreditCard
	Address        *Address
	AddressId      uint
	Login          *Login
	Profile        *Profile
	AccountBalance *AccountBalance
	AccountNumber  string
}

func NewAccount(creditCard []*CreditCard, address *Address, profile *Profile, login *Login) *Account {
	acct := new(Account)
	acct.Address = address
	acct.Profile = profile
	acct.Login = login
	acct.CreditCards = creditCard
	acctBalance := &AccountBalance{Balance: 0.0}
	acct.AccountBalance = acctBalance
	acct.AccountNumber = String(10)
	return acct
}

func NewAccountWithAddressProfileLogin(address *Address, profile *Profile, login *Login) *Account {
	acct := new(Account)
	acct.Address = address
	acct.Profile = profile
	acct.Login = login
	acctBalance := &AccountBalance{Balance: 0.0}
	acct.AccountBalance = acctBalance
	return acct
}

func NewAccountWithAddressProfile(address *Address, profile *Profile) *Account {
	acct := new(Account)
	acct.Address = address
	acct.Profile = profile
	acctBalance := &AccountBalance{Balance: 0.0}
	acct.AccountBalance = acctBalance
	return acct
}

func NewCreditCard(cardNumber string, cvc string) *CreditCard {
	creditCard := new(CreditCard)
	creditCard.CreditCardNumber = cardNumber
	creditCard.Cvc = cvc
	return creditCard
}

func NewProfile(firstName string, lastName string) *Profile {
	profile := new(Profile)
	profile.FirstName = firstName
	profile.LastName = lastName
	return profile
}

func NewAAddress(postalCode string, street string, city string, province string, phoneNumber string, email string) *Address {
	address := new(Address)
	address.City = city
	address.Email = email
	address.PostalCode = postalCode
	address.Province = province
	address.PhoneNumber = phoneNumber
	return address
}

func NewLogin(username string, password string) *Login {
	login := new(Login)
	login.Password = password
	login.Username = username
	return login
}

func (CreditCard) TableName() string {
	return "creditcardtbl"
}

func (Account) TableName() string {
	return "accounttbl"
}

func (Address) TableName() string {
	return "addresstbl"
}

func (Login) TableName() string {
	return "logintbl"
}

func (AccountBalance) TableName() string {
	return "acctBalancetbl"
}

func (Profile) TableName() string {
	return "profiletbl"
}

func AutoMigrate() {
	db := common.DB

	db.AutoMigrate(&Account{})
	db.AutoMigrate(&CreditCard{})
	db.AutoMigrate(&Login{})
	db.AutoMigrate(&Address{})
	db.AutoMigrate(&AccountBalance{})
	db.AutoMigrate(&Profile{})
}
