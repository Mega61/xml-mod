package com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "itemDiscountNo", "itemDiscountCode", "itemDiscountType", "itemDiscountGross",
        "itemDiscountDescr" })
public class ItemDiscount {

    private String itemDiscountNo;
    private String itemDiscountCode;
    private String itemDiscountType;
    private String itemDiscountGross;
    private String itemDiscountDescr;

    public ItemDiscount() {
    }

    public ItemDiscount(String itemDiscountNo, String itemDiscountCode, String itemDiscountType,
            String itemDiscountGross, String itemDiscountDescr) {
        this.itemDiscountNo = itemDiscountNo;
        this.itemDiscountCode = itemDiscountCode;
        this.itemDiscountType = itemDiscountType;
        this.itemDiscountGross = itemDiscountGross;
        this.itemDiscountDescr = itemDiscountDescr;
    }

    public String getItemDiscountNo() {
        return this.itemDiscountNo;
    }

    @XmlElement(name = "ItemDiscountNo")
    public void setItemDiscountNo(String itemDiscountNo) {
        this.itemDiscountNo = itemDiscountNo;
    }

    public String getItemDiscountCode() {
        return this.itemDiscountCode;
    }

    @XmlElement(name = "ItemDiscountCode")
    public void setItemDiscountCode(String itemDiscountCode) {
        this.itemDiscountCode = itemDiscountCode;
    }

    public String getItemDiscountType() {
        return this.itemDiscountType;
    }

    @XmlElement(name = "ItemDiscountType")
    public void setItemDiscountType(String itemDiscountType) {
        this.itemDiscountType = itemDiscountType;
    }

    public String getItemDiscountGross() {
        return this.itemDiscountGross;
    }

    @XmlElement(name = "ItemDiscountGross")
    public void setItemDiscountGross(String itemDiscountGross) {
        this.itemDiscountGross = itemDiscountGross;
    }

    public String getItemDiscountDescr() {
        return this.itemDiscountDescr;
    }

    @XmlElement(name = "ItemDiscountDescr")
    public void setItemDiscountDescr(String itemDiscountDescr) {
        this.itemDiscountDescr = itemDiscountDescr;
    }

}
