package com.xml.mod.orderrequestcomponents.ordercomponents;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents.Customer;
import com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents.Header;
import com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents.Item;
import com.xml.mod.orderrequestcomponents.ordercomponents.shopcomponents.Shop;

@XmlRootElement
@XmlType(propOrder = {"shops","headers", "customers","items"})
public class Order {

    private List<Shop> shops = new ArrayList<>();
    private List<Header> headers = new ArrayList<>();
    private List<Customer> customers =  new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    
    
    

    public Order() {
    }

    public List<Shop> getShops() {
        return this.shops;
    }

    @XmlElement(name = "Shop")
    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public List<Header> getHeaders() {
        return this.headers;
    }

    @XmlElement(name = "Header")
    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }


    public List<Customer> getCustomers() {
        return this.customers;
    }

    @XmlElement(name = "Customer")
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }


    public List<Item> getItems() {
        return this.items;
    }

    @XmlElementWrapper(name = "Items")
    @XmlElement(name = "Item")
    public void setItems(List<Item> items) {
        this.items = items;
    }



}
