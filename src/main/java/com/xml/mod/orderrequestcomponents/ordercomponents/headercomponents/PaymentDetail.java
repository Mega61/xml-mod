package com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "paymentToken", "creditCard", "cardOwner", "authAmount", "authorisationCode",
        "authorisationDate", "authorisationTime", "authorisationRef" })
public class PaymentDetail {

    private String paymentToken;
    private String creditCard;
    private String cardOwner;
    private String authAmount;
    private String authorisationCode;
    private String authorisationDate;
    private String authorisationTime;
    private String authorisationRef;

    public PaymentDetail() {
    }

    public PaymentDetail(String paymentToken, String creditCard, String cardOwner, String authAmount,
            String authorisationCode, String authorisationDate, String authorisationTime, String authorisationRef) {
        this.paymentToken = paymentToken;
        this.creditCard = creditCard;
        this.cardOwner = cardOwner;
        this.authAmount = authAmount;
        this.authorisationCode = authorisationCode;
        this.authorisationDate = authorisationDate;
        this.authorisationTime = authorisationTime;
        this.authorisationRef = authorisationRef;
    }

    public String getPaymentToken() {
        return this.paymentToken;
    }

    @XmlElement(name = "PaymentToken")
    public void setPaymentToken(String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getCreditCard() {
        return this.creditCard;
    }

    @XmlElement(name = "CreditCard")
    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCardOwner() {
        return this.cardOwner;
    }

    @XmlElement(name = "CardOwner")
    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getAuthAmount() {
        return this.authAmount;
    }

    @XmlElement(name = "AuthAmount")
    public void setAuthAmount(String authAmount) {
        this.authAmount = authAmount;
    }

    public String getAuthorisationCode() {
        return this.authorisationCode;
    }

    @XmlElement(name = "AuthorisationCode")
    public void setAuthorisationCode(String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }

    public String getAuthorisationDate() {
        return this.authorisationDate;
    }

    @XmlElement(name = "AuthorisationDate")
    public void setAuthorisationDate(String authorisationDate) {
        this.authorisationDate = authorisationDate;
    }

    public String getAuthorisationTime() {
        return this.authorisationTime;
    }

    @XmlElement(name = "AuthorisationTime")
    public void setAuthorisationTime(String authorisationTime) {
        this.authorisationTime = authorisationTime;
    }

    public String getAuthorisationRef() {
        return this.authorisationRef;
    }

    @XmlElement(name = "AuthorisationRef")
    public void setAuthorisationRef(String authorisationRef) {
        this.authorisationRef = authorisationRef;
    }

}
