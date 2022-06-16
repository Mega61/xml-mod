package com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "headerDiscountNo", "headerDiscountCode", "headerDiscountType", "headerDiscountGross",
        "headerDiscountDescr" })
public class HeaderDiscount {

    private String headerDiscountNo;
    private String headerDiscountCode;
    private String headerDiscountType;
    private String headerDiscountGross;
    private String headerDiscountDescr;

    public HeaderDiscount() {
    }

    public HeaderDiscount(String headerDiscountNo, String headerDiscountCode, String headerDiscountType,
            String headerDiscountGross, String headerDiscountDescr) {
        this.headerDiscountNo = headerDiscountNo;
        this.headerDiscountCode = headerDiscountCode;
        this.headerDiscountType = headerDiscountType;
        this.headerDiscountGross = headerDiscountGross;
        this.headerDiscountDescr = headerDiscountDescr;
    }

    public String getHeaderDiscountNo() {
        return this.headerDiscountNo;
    }

    @XmlElement(name = "HeaderDiscountNo")
    public void setHeaderDiscountNo(String headerDiscountNo) {
        this.headerDiscountNo = headerDiscountNo;
    }

    public String getHeaderDiscountCode() {
        return this.headerDiscountCode;
    }

    @XmlElement(name = "HeaderDiscountCode")
    public void setHeaderDiscountCode(String headerDiscountCode) {
        this.headerDiscountCode = headerDiscountCode;
    }

    public String getHeaderDiscountType() {
        return this.headerDiscountType;
    }

    @XmlElement(name = "HeaderDiscountType")
    public void setHeaderDiscountType(String headerDiscountType) {
        this.headerDiscountType = headerDiscountType;
    }

    public String getHeaderDiscountGross() {
        return this.headerDiscountGross;
    }

    @XmlElement(name = "HeaderDiscountGross")
    public void setHeaderDiscountGross(String headerDiscountGross) {
        this.headerDiscountGross = headerDiscountGross;
    }

    public String getHeaderDiscountDescr() {
        return this.headerDiscountDescr;
    }

    @XmlElement(name = "HeaderDiscountDescr")
    public void setHeaderDiscountDescr(String headerDiscountDescr) {
        this.headerDiscountDescr = headerDiscountDescr;
    }

}
