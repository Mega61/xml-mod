package com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "business", "salesChannel", "division", "orderType", "orderReason", "dispatchType",
        "paymentType", "orderNo", "transNo", "orderTimestamp", "paymentDetails", "headerPrices" })
public class Header {

    private String business;
    private String salesChannel;
    private String division;
    private String orderType;
    private String orderReason;
    private String dispatchType;
    private String paymentType;
    private String orderNo;
    private String transNo;
    private String orderTimestamp;

    private List<PaymentDetail> paymentDetails = new ArrayList<>();
    private List<HeaderPrice> headerPrices = new ArrayList<>();

    public Header() {
    }

    public Header(String business, String salesChannel, String division, String orderType, String orderReason,
            String dispatchType, String paymentType, String orderNo, String transNo, String orderTimestamp) {
        this.business = business;
        this.salesChannel = salesChannel;
        this.division = division;
        this.orderType = orderType;
        this.orderReason = orderReason;
        this.dispatchType = dispatchType;
        this.paymentType = paymentType;
        this.orderNo = orderNo;
        this.transNo = transNo;
        this.orderTimestamp = orderTimestamp;
    }

    public String getBusiness() {
        return this.business;
    }

    @XmlElement(name = "Business")
    public void setBusiness(String business) {
        this.business = business;
    }

    public String getSalesChannel() {
        return this.salesChannel;
    }

    @XmlElement(name = "SalesChannel")
    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }

    public String getDivision() {
        return this.division;
    }

    @XmlElement(name = "Division")
    public void setDivision(String division) {
        this.division = division;
    }

    public String getOrderType() {
        return this.orderType;
    }

    @XmlElement(name = "OrderType")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderReason() {
        return this.orderReason;
    }

    @XmlElement(name = "OrderReason")
    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }

    public String getDispatchType() {
        return this.dispatchType;
    }

    @XmlElement(name = "DispatchType")
    public void setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    @XmlElement(name = "PaymentType")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    @XmlElement(name = "OrderNo")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getTransNo() {
        return this.transNo;
    }

    @XmlElement(name = "TransNo")
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getOrderTimestamp() {
        return this.orderTimestamp;
    }

    @XmlElement(name = "OrderTimestamp")
    public void setOrderTimestamp(String orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public List<PaymentDetail> getPaymentDetails() {
        return this.paymentDetails;
    }

    @XmlElement(name = "PaymentDetail")
    public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    public List<HeaderPrice> getHeaderPrices() {
        return this.headerPrices;
    }

    @XmlElement(name = "HeaderPrice")
    public void setHeaderPrices(List<HeaderPrice> headerPrices) {
        this.headerPrices = headerPrices;
    }


}
