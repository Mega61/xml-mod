package com.xml.mod.orderrequestcomponents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.xml.mod.orderrequestcomponents.ordercomponents.Order;

@XmlRootElement(name = "OrderRequest")
public class OrderRequest {

    private String dataSource;

    private int numberOfOrders;

    private List<Order> orders = new ArrayList<>();

    public OrderRequest(String dataSource, int numberOfOrders) {
        this.dataSource = dataSource;
        this.numberOfOrders = numberOfOrders;
        
    }

    public OrderRequest() {
    }

    public String getDataSource() {
        return dataSource;
    }

    @XmlElement(name = "Datasource")
    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }

    @XmlElement(name = "NumberOfOrders")
    public void setNumberOfOrders(int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @XmlElementWrapper(name = "Orders")
    @XmlElement(name = "Order")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "eCommerceRRP{" +
                "Datasource='" + dataSource + '\''+
                "NumberOfOrders='" + numberOfOrders + '\''+
                "Orders='";
    }

}
