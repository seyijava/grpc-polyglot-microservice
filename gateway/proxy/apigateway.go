package proxy

import (
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"

	account "github.com/bigdataconcept/gateway/account"
	dailer "github.com/bigdataconcept/gateway/dailer"
	portfolio "github.com/bigdataconcept/gateway/portfolio"
	quote "github.com/bigdataconcept/gateway/quote"
	tracer "github.com/bigdataconcept/gateway/tracer"
	opentracing "github.com/opentracing/opentracing-go"
)

type ServiceUrl struct {
	AccountUrl   string
	QuoteUrl     string
	PortfolioUrl string
}

type TraderServiceAPIGateway struct {
	tracer          opentracing.Tracer
	accountClient   account.AccountRpcServiceClient
	quoteClient     quote.QuoteRpcServiceClient
	portfolioClient portfolio.PortfolioServiceClient
}

func NewTraderServiceAPIGateway(trace opentracing.Tracer, accountClient account.AccountRpcServiceClient, quoteClient quote.QuoteRpcServiceClient, portfolioClient portfolio.PortfolioServiceClient) *TraderServiceAPIGateway {
	return &TraderServiceAPIGateway{
		tracer:          trace,
		accountClient:   accountClient,
		quoteClient:     quoteClient,
		portfolioClient: portfolioClient,
	}
}

func (gw *TraderServiceAPIGateway) getAllCreditCardsByAccountHandler(w http.ResponseWriter, req *http.Request) {
	var creditCardRequests account.CreditCardsRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &creditCardRequests)
	if err == nil {
		generateErrorMessage(err, w)
		creditCardResponse, errs := gw.accountClient.GetAllCreditCardsByAccount(req.Context(), &creditCardRequests)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(creditCardResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) depositandler(w http.ResponseWriter, req *http.Request) {
	var depositRequest account.DepositRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &depositRequest)
	if err == nil {
		generateErrorMessage(err, w)
		depositResponse, errs := gw.accountClient.Deposit(req.Context(), &depositRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(depositResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}
}

func (gw *TraderServiceAPIGateway) withdrawHandler(w http.ResponseWriter, req *http.Request) {
	var withdrawRequest account.WithdrawRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &withdrawRequest)
	if err == nil {
		generateErrorMessage(err, w)
		withdrawResponse, errs := gw.accountClient.Withdraw(req.Context(), &withdrawRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(withdrawResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) getProfileByAccountHandler(w http.ResponseWriter, req *http.Request) {
	var profileRequest account.ProfileRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &profileRequest)
	if err == nil {
		generateErrorMessage(err, w)
		profileResponse, errs := gw.accountClient.GetProfileByAccount(req.Context(), &profileRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(profileResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) getAccountBalanceHandler(w http.ResponseWriter, req *http.Request) {
	var balanceRequest account.BalanceRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &balanceRequest)
	if err == nil {
		generateErrorMessage(err, w)
		balanceResponse, errs := gw.accountClient.GetAccountBalance(req.Context(), &balanceRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(balanceResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) updateProfileHandler(w http.ResponseWriter, req *http.Request) {
	var profileUpdateRequest account.ProfileUpdateRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &profileUpdateRequest)
	if err == nil {
		generateErrorMessage(err, w)
		profileUpdateResponse, errs := gw.accountClient.UpdateProfile(req.Context(), &profileUpdateRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(profileUpdateResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}
}

func (gw *TraderServiceAPIGateway) updateAddressHandler(w http.ResponseWriter, req *http.Request) {
	var addresssUpdateRequest account.AddresssUpdateRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &addresssUpdateRequest)
	if err == nil {
		generateErrorMessage(err, w)
		addAddressUpdateResponse, errs := gw.accountClient.UpdateAddress(req.Context(), &addresssUpdateRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(addAddressUpdateResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) addCreditCardHandler(w http.ResponseWriter, req *http.Request) {

	var addCreditCardRequest account.AddCreditCardRequest
	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &addCreditCardRequest)
	if err == nil {
		generateErrorMessage(err, w)
		addCreditCardResponse, errs := gw.accountClient.AddCreditCard(req.Context(), &addCreditCardRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(addCreditCardResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) createAccountHandler(w http.ResponseWriter, req *http.Request) {

	var acctRequest account.AddAccountRequest

	temp, _ := ioutil.ReadAll(req.Body)
	err := json.Unmarshal(temp, &acctRequest)
	if err == nil {
		generateErrorMessage(err, w)
		acctResponse, errs := gw.accountClient.AddAccount(req.Context(), &acctRequest)
		if errs != nil {
			generateErrorMessage(errs, w)
		}
		generateSucessfullResponseMessage(acctResponse, w)
	} else {
		errorResponse := &ErrorResponse{ErrorMsg: "Invalid Json"}
		generateSucessfullResponseMessage(errorResponse, w)
	}

}

func (gw *TraderServiceAPIGateway) run(port int, serverIP string) error {

	mux := tracer.NewServeMux(gw.tracer)
	mux.Handle("/", http.FileServer(http.Dir("services/frontend/static")))
	mux.Handle("/addAccount.do", http.HandlerFunc(gw.createAccountHandler))
	mux.Handle("/addFund.do", http.HandlerFunc(gw.depositandler))
	mux.Handle("/withdralFund.do", http.HandlerFunc(gw.withdrawHandler))
	mux.Handle("/listCards.do", http.HandlerFunc(gw.getAllCreditCardsByAccountHandler))
	mux.Handle("/profile.do", http.HandlerFunc(gw.getProfileByAccountHandler))
	mux.Handle("/balance.do", http.HandlerFunc(gw.getAccountBalanceHandler))
	mux.Handle("/addCreditCard.do", http.HandlerFunc(gw.addCreditCardHandler))
	mux.Handle("/updateProfile.do", http.HandlerFunc(gw.updateProfileHandler))
	mux.Handle("/updateAddress.do", http.HandlerFunc(gw.updateAddressHandler))

	return http.ListenAndServe(fmt.Sprintf("%s:%d", serverIP, port), mux)
}

func StartAPIGateway(port int, serverIP string, jaegeraddr string, serviceUrl *ServiceUrl) {

	tracer, err := tracer.Init("Gateway", jaegeraddr)
	if err != nil {
		panic(err)
	}

	accountClient, err := dailer.Dial(
		serviceUrl.AccountUrl,
		dailer.WithTracer(tracer),
	)
	if err != nil {
		panic(err)

	}

	quoteClient, err := dailer.Dial(
		serviceUrl.QuoteUrl,
		dailer.WithTracer(tracer),
	)
	if err != nil {
		panic(err)
	}

	portfolioClient, err := dailer.Dial(
		serviceUrl.PortfolioUrl,
		dailer.WithTracer(tracer),
	)
	if err != nil {
		panic(err)
	}

	apiGateway := NewTraderServiceAPIGateway(tracer, account.NewAccountRpcServiceClient(accountClient), quote.NewQuoteRpcServiceClient(quoteClient), portfolio.NewPortfolioServiceClient(portfolioClient))

	errs := apiGateway.run(port, serverIP)

	if err != nil {
		panic(errs)

	} else {
		fmt.Println("Server started:")
	}

}

type ErrorResponse struct {
	ErrorMsg string
}

func generateErrorMessage(err error, w http.ResponseWriter) {
	if err != nil {
		http.Error(w, err.Error(), http.StatusInternalServerError)
		return
	}
}

func generateSucessfullResponseMessage(response interface{}, w http.ResponseWriter) {

	jsonResponse, err := json.Marshal(response)
	generateErrorMessage(err, w)
	w.Header().Set("Content-Type", "application/json")
	w.Write(jsonResponse)
}
