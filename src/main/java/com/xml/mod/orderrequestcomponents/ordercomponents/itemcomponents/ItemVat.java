package com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "itemVatRate", "itemVatValue", "originalItemVatValue", "itemVatPerUnit",
        "originalItemVatPerUnit" })
public class ItemVat {

    private String itemVatRate;
    private String itemVatValue;
    private String originalItemVatValue;
    private String itemVatPerUnit;
    private String originalItemVatPerUnit;

    public ItemVat() {
    }

    public ItemVat(String itemVatRate, String itemVatValue, String originalItemVatValue, String itemVatPerUnit,
            String originalItemVatPerUnit) {
        this.itemVatRate = itemVatRate;
        this.itemVatValue = itemVatValue;
        this.originalItemVatValue = originalItemVatValue;
        this.itemVatPerUnit = itemVatPerUnit;
        this.originalItemVatPerUnit = originalItemVatPerUnit;
    }

    public String getItemVatRate() {
        return this.itemVatRate;
    }

    @XmlElement(name = "ItemVatRate")
    public void setItemVatRate(String itemVatRate) {
        this.itemVatRate = itemVatRate;
    }

    public String getItemVatValue() {
        return this.itemVatValue;
    }

    @XmlElement(name = "ItemVatValue")
    public void setItemVatValue(String itemVatValue) {
        this.itemVatValue = itemVatValue;
    }

    public String getOriginalItemVatValue() {
        return this.originalItemVatValue;
    }

    @XmlElement(name = "OriginalItemVatValue")
    public void setOriginalItemVatValue(String originalItemVatValue) {
        this.originalItemVatValue = originalItemVatValue;
    }

    public String getItemVatPerUnit() {
        return this.itemVatPerUnit;
    }

    @XmlElement(name = "ItemVatPerUnit")
    public void setItemVatPerUnit(String itemVatPerUnit) {
        this.itemVatPerUnit = itemVatPerUnit;
    }

    public String getOriginalItemVatPerUnit() {
        return this.originalItemVatPerUnit;
    }

    @XmlElement(name = "OriginalItemVatPerUnit")
    public void setOriginalItemVatPerUnit(String originalItemVatPerUnit) {
        this.originalItemVatPerUnit = originalItemVatPerUnit;
    }

}
