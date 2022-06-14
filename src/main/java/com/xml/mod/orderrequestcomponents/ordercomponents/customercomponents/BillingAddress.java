package com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "billingFirstName", "billingLastname", "billingCompany", "billingStreet", "billingStreetNo",
        "billingBuilding", "billingDigicode", "billingAddressExtension2", "billingAddressExtension1", "billingPoBox",
        "billingZIP", "billingCity", "billingRegion", "billingCountry", "billingLanguage", "billingEmail",
        "billingTelNo", "billingBirthday" })
public class BillingAddress {

    private String billingFirstName;
    private String billingLastname;
    private String billingCompany;
    private String billingStreet;
    private String billingStreetNo;
    private String billingBuilding;
    private String billingDigicode;
    private String billingAddressExtension2;
    private String billingAddressExtension1;
    private String billingPoBox;
    private String billingZIP;
    private String billingCity;
    private String billingRegion;
    private String billingCountry;
    private String billingLanguage;
    private String billingEmail;
    private String billingTelNo;
    private String billingBirthday;

    public BillingAddress() {
    }

    public BillingAddress(String billingFirstName, String billingLastname, String billingCompany, String billingStreet,
            String billingStreetNo, String billingBuilding, String billingDigicode, String billingAddressExtension2,
            String billingAddressExtension1, String billingPoBox, String billingZIP, String billingCity,
            String billingRegion, String billingCountry, String billingLanguage, String billingEmail,
            String billingTelNo, String billingBirthday) {
        this.billingFirstName = billingFirstName;
        this.billingLastname = billingLastname;
        this.billingCompany = billingCompany;
        this.billingStreet = billingStreet;
        this.billingStreetNo = billingStreetNo;
        this.billingBuilding = billingBuilding;
        this.billingDigicode = billingDigicode;
        this.billingAddressExtension2 = billingAddressExtension2;
        this.billingAddressExtension1 = billingAddressExtension1;
        this.billingPoBox = billingPoBox;
        this.billingZIP = billingZIP;
        this.billingCity = billingCity;
        this.billingRegion = billingRegion;
        this.billingCountry = billingCountry;
        this.billingLanguage = billingLanguage;
        this.billingEmail = billingEmail;
        this.billingTelNo = billingTelNo;
        this.billingBirthday = billingBirthday;
    }

    public String getBillingFirstName() {
        return this.billingFirstName;
    }

    @XmlElement(name = "BillingFirstName")
    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastname() {
        return this.billingLastname;
    }

    @XmlElement(name = "BillingLastname")
    public void setBillingLastname(String billingLastname) {
        this.billingLastname = billingLastname;
    }

    public String getBillingCompany() {
        return this.billingCompany;
    }

    @XmlElement(name = "BillingCompany")
    public void setBillingCompany(String billingCompany) {
        this.billingCompany = billingCompany;
    }

    public String getBillingStreet() {
        return this.billingStreet;
    }

    @XmlElement(name = "BillingStreet")
    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingStreetNo() {
        return this.billingStreetNo;
    }

    @XmlElement(name = "BillingStreetNo")
    public void setBillingStreetNo(String billingStreetNo) {
        this.billingStreetNo = billingStreetNo;
    }

    public String getBillingBuilding() {
        return this.billingBuilding;
    }

    @XmlElement(name = "BillingBuilding")
    public void setBillingBuilding(String billingBuilding) {
        this.billingBuilding = billingBuilding;
    }

    public String getBillingDigicode() {
        return this.billingDigicode;
    }

    @XmlElement(name = "BillingDigicode")
    public void setBillingDigicode(String billingDigicode) {
        this.billingDigicode = billingDigicode;
    }

    public String getBillingAddressExtension2() {
        return this.billingAddressExtension2;
    }

    @XmlElement(name = "BillingAddressExtension2")
    public void setBillingAddressExtension2(String billingAddressExtension2) {
        this.billingAddressExtension2 = billingAddressExtension2;
    }

    public String getBillingAddressExtension1() {
        return this.billingAddressExtension1;
    }

    @XmlElement(name = "BillingAddressExtension1")
    public void setBillingAddressExtension1(String billingAddressExtension1) {
        this.billingAddressExtension1 = billingAddressExtension1;
    }

    public String getBillingPoBox() {
        return this.billingPoBox;
    }

    @XmlElement(name = "BillingPoBox")
    public void setBillingPoBox(String billingPoBox) {
        this.billingPoBox = billingPoBox;
    }

    public String getBillingZIP() {
        return this.billingZIP;
    }

    @XmlElement(name = "BillingZIP")
    public void setBillingZIP(String billingZIP) {
        this.billingZIP = billingZIP;
    }

    public String getBillingCity() {
        return this.billingCity;
    }

    @XmlElement(name = "BillingCity")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingRegion() {
        return this.billingRegion;
    }

    @XmlElement(name = "BillingRegion")
    public void setBillingRegion(String billingRegion) {
        this.billingRegion = billingRegion;
    }

    public String getBillingCountry() {
        return this.billingCountry;
    }

    @XmlElement(name = "BillingCountry")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingLanguage() {
        return this.billingLanguage;
    }

    @XmlElement(name = "BillingLanguage")
    public void setBillingLanguage(String billingLanguage) {
        this.billingLanguage = billingLanguage;
    }

    public String getBillingEmail() {
        return this.billingEmail;
    }

    @XmlElement(name = "BillingEmail")
    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingTelNo() {
        return this.billingTelNo;
    }

    @XmlElement(name = "BillingTelNo")
    public void setBillingTelNo(String billingTelNo) {
        this.billingTelNo = billingTelNo;
    }

    public String getBillingBirthday() {
        return this.billingBirthday;
    }

    @XmlElement(name = "BillingBirthday")
    public void setBillingBirthday(String billingBirthday) {
        this.billingBirthday = billingBirthday;
    }

}
