package com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "currency", "headerNet", "headerNetOriginal", "headerGross", "headerGrossOriginal",
        "subTotalGross", "headerVatRate", "headerVatValue", "carrierGross", "headerDiscounts" })
public class HeaderPrice {

    private String currency;
    private String headerNet;
    private String headerNetOriginal;
    private String headerGross;
    private String headerGrossOriginal;
    private String subTotalGross;
    private String headerVatRate;
    private String headerVatValue;
    private String carrierGross;

    //@XmlElementWrapper(name = "HeaderDiscounts", nillable = true)
    private List<HeaderDiscount> headerDiscount = new ArrayList<>();

    public HeaderPrice() {
    }

    public HeaderPrice(String currency, String headerNet, String headerNetOriginal, String headerGross,
            String headerGrossOriginal, String subTotalGross, String headerVatRate, String headerVatValue,
            String carrierGross) {
        this.currency = currency;
        this.headerNet = headerNet;
        this.headerNetOriginal = headerNetOriginal;
        this.headerGross = headerGross;
        this.headerGrossOriginal = headerGrossOriginal;
        this.subTotalGross = subTotalGross;
        this.headerVatRate = headerVatRate;
        this.headerVatValue = headerVatValue;
        this.carrierGross = carrierGross;
    }

    public String getCurrency() {
        return this.currency;
    }

    @XmlElement(name = "Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getHeaderNet() {
        return this.headerNet;
    }

    @XmlElement(name = "HeaderNet")
    public void setHeaderNet(String headerNet) {
        this.headerNet = headerNet;
    }

    public String getHeaderNetOriginal() {
        return this.headerNetOriginal;
    }

    @XmlElement(name = "HeaderNetOriginal")
    public void setHeaderNetOriginal(String headerNetOriginal) {
        this.headerNetOriginal = headerNetOriginal;
    }

    public String getHeaderGross() {
        return this.headerGross;
    }

    @XmlElement(name = "HeaderGross")
    public void setHeaderGross(String headerGross) {
        this.headerGross = headerGross;
    }

    public String getheaderGrossOriginal() {
        return this.headerGrossOriginal;
    }

    @XmlElement(name = "HeaderGrossOriginal")
    public void setheaderGrossOriginal(String headerGrossOriginal) {
        this.headerGrossOriginal = headerGrossOriginal;
    }

    public String getSubTotalGross() {
        return this.subTotalGross;
    }

    @XmlElement(name = "SubTotalGross")
    public void setSubTotalGross(String subTotalGross) {
        this.subTotalGross = subTotalGross;
    }

    public String getHeaderVatRate() {
        return this.headerVatRate;
    }

    @XmlElement(name = "HeaderVatRate")
    public void setHeaderVatRate(String headerVatRate) {
        this.headerVatRate = headerVatRate;
    }

    public String getHeaderVatValue() {
        return this.headerVatValue;
    }

    @XmlElement(name = "HeaderVatValue")
    public void setHeaderVatValue(String headerVatValue) {
        this.headerVatValue = headerVatValue;
    }

    public String getCarrierGross() {
        return this.carrierGross;
    }

    @XmlElement(name = "CarrierGross")
    public void setCarrierGross(String carrierGross) {
        this.carrierGross = carrierGross;
    }

    public List<HeaderDiscount> getHeaderDiscounts() {
        return this.headerDiscount;
    }

    @XmlElementWrapper(name = "HeaderDiscounts", nillable = true)
    @XmlElement(name = "HeaderDiscount", required = false)
    public void setHeaderDiscounts(List<HeaderDiscount> headerDiscount) {
        this.headerDiscount = headerDiscount;
    }

}
