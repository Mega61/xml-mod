package com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "shippingFirstName", "shippingLastname", "shippingCompany", "shippingStreet", "shippingStreetNo",
        "shippingBuilding", "shippingDigicode", "shippingAddressExtension2", "shippingAddressExtension1",
        "shippingPoBox", "shippingZIP", "shippingCity", "shippingRegion", "shippingCountry", "shippingLanguage",
        "shippingEmail", "shippingTelNo" })
public class ShippingAddress {

    private String shippingFirstName;
    private String shippingLastname;
    private String shippingCompany;
    private String shippingStreet;
    private String shippingStreetNo;
    private String shippingBuilding;
    private String shippingDigicode;
    private String shippingAddressExtension2;
    private String shippingAddressExtension1;
    private String shippingPoBox;
    private String ShippingZIP;
    private String shippingCity;
    private String shippingRegion;
    private String shippingCountry;
    private String shippingLanguage;
    private String shippingEmail;
    private String shippingTelNo;

    public ShippingAddress() {
    }

    public ShippingAddress(String shippingFirstName, String shippingLastname, String shippingCompany,
            String shippingStreet, String shippingStreetNo, String shippingBuilding, String shippingDigicode,
            String shippingAddressExtension2, String shippingAddressExtension1, String shippingPoBox,
            String ShippingZIP, String shippingCity, String shippingRegion, String shippingCountry,
            String shippingLanguage, String shippingEmail, String shippingTelNo) {
        this.shippingFirstName = shippingFirstName;
        this.shippingLastname = shippingLastname;
        this.shippingCompany = shippingCompany;
        this.shippingStreet = shippingStreet;
        this.shippingStreetNo = shippingStreetNo;
        this.shippingBuilding = shippingBuilding;
        this.shippingDigicode = shippingDigicode;
        this.shippingAddressExtension2 = shippingAddressExtension2;
        this.shippingAddressExtension1 = shippingAddressExtension1;
        this.shippingPoBox = shippingPoBox;
        this.ShippingZIP = ShippingZIP;
        this.shippingCity = shippingCity;
        this.shippingRegion = shippingRegion;
        this.shippingCountry = shippingCountry;
        this.shippingLanguage = shippingLanguage;
        this.shippingEmail = shippingEmail;
        this.shippingTelNo = shippingTelNo;
    }

    public String getShippingFirstName() {
        return this.shippingFirstName;
    }

    @XmlElement(name = "ShippingFirstName")
    public void setShippingFirstName(String shippingFirstName) {
        this.shippingFirstName = shippingFirstName;
    }

    public String getShippingLastname() {
        return this.shippingLastname;
    }

    @XmlElement(name = "ShippingLastname")
    public void setShippingLastname(String shippingLastname) {
        this.shippingLastname = shippingLastname;
    }

    public String getShippingCompany() {
        return this.shippingCompany;
    }

    @XmlElement(name = "ShippingCompany")
    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getShippingStreet() {
        return this.shippingStreet;
    }

    @XmlElement(name = "ShippingStreet")
    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingStreetNo() {
        return this.shippingStreetNo;
    }

    @XmlElement(name = "ShippingStreetNo")
    public void setShippingStreetNo(String shippingStreetNo) {
        this.shippingStreetNo = shippingStreetNo;
    }

    public String getShippingBuilding() {
        return this.shippingBuilding;
    }

    @XmlElement(name = "ShippingBuilding")
    public void setShippingBuilding(String shippingBuilding) {
        this.shippingBuilding = shippingBuilding;
    }

    public String getShippingDigicode() {
        return this.shippingDigicode;
    }

    @XmlElement(name = "ShippingDigicode")
    public void setShippingDigicode(String shippingDigicode) {
        this.shippingDigicode = shippingDigicode;
    }

    public String getShippingAddressExtension2() {
        return this.shippingAddressExtension2;
    }

    @XmlElement(name = "ShippingAddressExtension2")
    public void setShippingAddressExtension2(String shippingAddressExtension2) {
        this.shippingAddressExtension2 = shippingAddressExtension2;
    }

    public String getShippingAddressExtension1() {
        return this.shippingAddressExtension1;
    }

    @XmlElement(name = "ShippingAddressExtension1")
    public void setShippingAddressExtension1(String shippingAddressExtension1) {
        this.shippingAddressExtension1 = shippingAddressExtension1;
    }

    public String getShippingPoBox() {
        return this.shippingPoBox;
    }

    @XmlElement(name = "ShippingPoBox")
    public void setShippingPoBox(String shippingPoBox) {
        this.shippingPoBox = shippingPoBox;
    }

    public String getShippingCity() {
        return this.shippingCity;
    }

    public String getShippingZIP() {
        return this.ShippingZIP;
    }

    @XmlElement(name = "ShippingZIP")
    public void setShippingZIP(String ShippingZIP) {
        this.ShippingZIP = ShippingZIP;
    }

    @XmlElement(name = "ShippingCity")
    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingRegion() {
        return this.shippingRegion;
    }

    @XmlElement(name = "ShippingRegion")
    public void setShippingRegion(String shippingRegion) {
        this.shippingRegion = shippingRegion;
    }

    public String getShippingCountry() {
        return this.shippingCountry;
    }

    @XmlElement(name = "ShippingCountry")
    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingLanguage() {
        return this.shippingLanguage;
    }

    @XmlElement(name = "ShippingLanguage")
    public void setShippingLanguage(String shippingLanguage) {
        this.shippingLanguage = shippingLanguage;
    }

    public String getShippingEmail() {
        return this.shippingEmail;
    }

    @XmlElement(name = "ShippingEmail")
    public void setShippingEmail(String shippingEmail) {
        this.shippingEmail = shippingEmail;
    }

    public String getShippingTelNo() {
        return this.shippingTelNo;
    }

    @XmlElement(name = "ShippingTelNo")
    public void setShippingTelNo(String shippingTelNo) {
        this.shippingTelNo = shippingTelNo;
    }

}
