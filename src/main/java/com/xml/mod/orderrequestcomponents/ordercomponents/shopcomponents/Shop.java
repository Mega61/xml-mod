package com.xml.mod.orderrequestcomponents.ordercomponents.shopcomponents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Shop {

    private int shopNo;

    public Shop() {
    }

    public Shop(int shopNo) {
        this.shopNo = shopNo;
    }

    public int getShopNo() {
        return this.shopNo;
    }

    @XmlElement(name = "ShopNo")
    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

}
