package com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "custumerNo", "customerTyp", "identityTyp","identityNo", "shippingAndBillingEqual", "billingAddresses",
        "shippingAdresses" })
public class Customer {

    private String custumerNo;
    private String customerTyp;
    private String identityTyp;
    private String identityNo;
    private String shippingAndBillingEqual;

    private List<BillingAddress> billingAddresses = new ArrayList<>();
    private List<ShippingAddress> shippingAdresses = new ArrayList<>();

    public Customer() {
    }


    public Customer(String custumerNo, String customerTyp, String identityTyp, String identityNo, String shippingAndBillingEqual) {
        this.custumerNo = custumerNo;
        this.customerTyp = customerTyp;
        this.identityTyp = identityTyp;
        this.identityNo = identityNo;
        this.shippingAndBillingEqual = shippingAndBillingEqual;
    }


    public String getCustumerNo() {
        return this.custumerNo;
    }

    @XmlElement(name = "CustomerNo")
    public void setCustumerNo(String custumerNo) {
        this.custumerNo = custumerNo;
    }

    public String getCustomerTyp() {
        return this.customerTyp;
    }

    @XmlElement(name = "CustomerTyp")
    public void setCustomerTyp(String customerTyp) {
        this.customerTyp = customerTyp;
    }

    public String getIdentityTyp() {
        return this.identityTyp;
    }

    @XmlElement(name = "IdentityTyp")
    public void setIdentityTyp(String identityTyp) {
        this.identityTyp = identityTyp;
    }

    public String getShippingAndBillingEqual() {
        return this.shippingAndBillingEqual;
    }

    @XmlElement(name = "ShippingAndBillingEqual")
    public void setShippingAndBillingEqual(String shippingAndBillingEqual) {
        this.shippingAndBillingEqual = shippingAndBillingEqual;
    }

    public String getidentityNo() {
        return this.identityNo;
    }

    @XmlElement(name = "IdentityNo")
    public void setidentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public List<BillingAddress> getBillingAddresses() {
        return this.billingAddresses;
    }

    @XmlElement(name = "BillingAddress")
    public void setBillingAddresses(List<BillingAddress> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public List<ShippingAddress> getShippingAdresses() {
        return this.shippingAdresses;
    }

    @XmlElement(name = "ShippingAddress")
    public void setShippingAdresses(List<ShippingAddress> shippingAdresses) {
        this.shippingAdresses = shippingAdresses;
    }

}
