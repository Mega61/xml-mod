package com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "deliveryItemNumber", "orderItemType", "orderAvailDateItem", "articleNo", "salesText", "serial",
        "gCRSTicketNo", "quantity", "quantityUnit", "stockAssign", "itemNet", "itemNetOriginal", "itemNetPerUnit",
        "itemNetPerUnitOriginal", "itemGross", "itemGrossOriginal", "itemGrossPerUnit", "itemGrossPerUnitOriginal",
        "itemDiscounts", "itemVat" })
public class Item {

    private String deliveryItemNumber;
    private String orderItemType;
    private String orderAvailDateItem;
    private String articleNo;
    private String salesText;
    private String serial;
    private String gCRSTicketNo;
    private String quantity;
    private String quantityUnit;
    private String stockAssign;
    private String itemNet;
    private String itemNetOriginal;
    private String itemNetPerUnit;
    private String itemNetPerUnitOriginal;
    private String itemGross;
    private String itemGrossOriginal;
    private String itemGrossPerUnit;
    private String itemGrossPerUnitOriginal;

    private List<ItemDiscount> itemDiscounts = new ArrayList<>();
    private List<ItemVat> itemVat = new ArrayList<>();

    public Item() {
    }

    public Item(String deliveryItemNumber, String orderItemType, String orderAvailDateItem, String articleNo,
            String salesText, String serial, String gCRSTicketNo, String quantity, String quantityUnit,
            String stockAssign, String itemNet, String itemNetOriginal, String itemNetPerUnit,
            String itemNetPerUnitOriginal, String itemGross, String itemGrossOriginal, String itemGrossPerUnit,
            String itemGrossPerUnitOriginal) {
        this.deliveryItemNumber = deliveryItemNumber;
        this.orderItemType = orderItemType;
        this.orderAvailDateItem = orderAvailDateItem;
        this.articleNo = articleNo;
        this.salesText = salesText;
        this.serial = serial;
        this.gCRSTicketNo = gCRSTicketNo;
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
        this.stockAssign = stockAssign;
        this.itemNet = itemNet;
        this.itemNetOriginal = itemNetOriginal;
        this.itemNetPerUnit = itemNetPerUnit;
        this.itemNetPerUnitOriginal = itemNetPerUnitOriginal;
        this.itemGross = itemGross;
        this.itemGrossOriginal = itemGrossOriginal;
        this.itemGrossPerUnit = itemGrossPerUnit;
        this.itemGrossPerUnitOriginal = itemGrossPerUnitOriginal;
    }

    public String getDeliveryItemNumber() {
        return this.deliveryItemNumber;
    }

    @XmlElement(name = "DeliveryItemNumber")
    public void setDeliveryItemNumber(String deliveryItemNumber) {
        this.deliveryItemNumber = deliveryItemNumber;
    }

    public String getOrderItemType() {
        return this.orderItemType;
    }

    @XmlElement(name = "OrderItemType")
    public void setOrderItemType(String orderItemType) {
        this.orderItemType = orderItemType;
    }

    public String getOrderAvailDateItem() {
        return this.orderAvailDateItem;
    }

    @XmlElement(name = "OrderAvailDateItem")
    public void setOrderAvailDateItem(String orderAvailDateItem) {
        this.orderAvailDateItem = orderAvailDateItem;
    }

    public String getArticleNo() {
        return this.articleNo;
    }

    @XmlElement(name = "ArticleNo")
    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getSalesText() {
        return this.salesText;
    }

    @XmlElement(name = "SalesText")
    public void setSalesText(String salesText) {
        this.salesText = salesText;
    }

    public String getSerial() {
        return this.serial;
    }

    @XmlElement(name = "Serial")
    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getGCRSTicketNo() {
        return this.gCRSTicketNo;
    }

    @XmlElement(name = "GCRSTicketNo")
    public void setGCRSTicketNo(String gCRSTicketNo) {
        this.gCRSTicketNo = gCRSTicketNo;
    }

    public String getQuantity() {
        return this.quantity;
    }

    @XmlElement(name = "Quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnit() {
        return this.quantityUnit;
    }

    @XmlElement(name = "QuantityUnit")
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public String getStockAssign() {
        return this.stockAssign;
    }

    @XmlElement(name = "StockAssign")
    public void setStockAssign(String stockAssign) {
        this.stockAssign = stockAssign;
    }

    public String getItemNet() {
        return this.itemNet;
    }

    @XmlElement(name = "ItemNet")
    public void setItemNet(String itemNet) {
        this.itemNet = itemNet;
    }

    public String getItemNetOriginal() {
        return this.itemNetOriginal;
    }

    @XmlElement(name = "ItemNetOriginal")
    public void setItemNetOriginal(String itemNetOriginal) {
        this.itemNetOriginal = itemNetOriginal;
    }

    public String getItemNetPerUnit() {
        return this.itemNetPerUnit;
    }

    @XmlElement(name = "ItemNetPerUnit")
    public void setItemNetPerUnit(String itemNetPerUnit) {
        this.itemNetPerUnit = itemNetPerUnit;
    }

    public String getItemNetPerUnitOriginal() {
        return this.itemNetPerUnitOriginal;
    }

    @XmlElement(name = "ItemNetPerUnitOriginal")
    public void setItemNetPerUnitOriginal(String itemNetPerUnitOriginal) {
        this.itemNetPerUnitOriginal = itemNetPerUnitOriginal;
    }

    public String getItemGross() {
        return this.itemGross;
    }

    @XmlElement(name = "ItemGross")
    public void setItemGross(String itemGross) {
        this.itemGross = itemGross;
    }

    public String getItemGrossOriginal() {
        return this.itemGrossOriginal;
    }

    @XmlElement(name = "ItemGrossOriginal")
    public void setItemGrossOriginal(String itemGrossOriginal) {
        this.itemGrossOriginal = itemGrossOriginal;
    }

    public String getItemGrossPerUnit() {
        return this.itemGrossPerUnit;
    }

    @XmlElement(name = "ItemGrossPerUnit")
    public void setItemGrossPerUnit(String itemGrossPerUnit) {
        this.itemGrossPerUnit = itemGrossPerUnit;
    }

    public String getItemGrossPerUnitOriginal() {
        return this.itemGrossPerUnitOriginal;
    }

    @XmlElement(name = "ItemGrossPerUnitOriginal")
    public void setItemGrossPerUnitOriginal(String itemGrossPerUnitOriginal) {
        this.itemGrossPerUnitOriginal = itemGrossPerUnitOriginal;
    }

    public List<ItemDiscount> getItemDiscounts() {
        return this.itemDiscounts;
    }

    @XmlElementWrapper(name = "ItemDiscounts", nillable = true)
    @XmlElement(name = "ItemDiscount", required = true)
    public void setItemDiscounts(List<ItemDiscount> itemDiscounts) {
        this.itemDiscounts = itemDiscounts;
    }

    public List<ItemVat> getItemVat() {
        return this.itemVat;
    }

    @XmlElement(name = "DeliveryItemNumber")
    public void setItemVat(List<ItemVat> itemVat) {
        this.itemVat = itemVat;
    }

}
