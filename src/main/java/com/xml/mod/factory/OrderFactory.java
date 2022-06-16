package com.xml.mod.factory;

import java.util.List;

import com.xml.mod.orderrequestcomponents.OrderRequest;
import com.xml.mod.orderrequestcomponents.ordercomponents.Order;
import com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents.BillingAddress;
import com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents.Customer;
import com.xml.mod.orderrequestcomponents.ordercomponents.customercomponents.ShippingAddress;
import com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents.Header;
import com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents.HeaderPrice;
import com.xml.mod.orderrequestcomponents.ordercomponents.headercomponents.PaymentDetail;
import com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents.Item;
import com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents.ItemVat;
import com.xml.mod.orderrequestcomponents.ordercomponents.shopcomponents.Shop;

public class OrderFactory {

    // Objeto global de la orden
    public static OrderRequest creatOrderRequest(String dataSource, int numberOfOrders, Order orders) {

        OrderRequest orderRequest = new OrderRequest(dataSource, numberOfOrders);

        orderRequest.getOrders().add(orders);

        return orderRequest;

    }

    // Sub objeto global de la orden contiene 3 bloques
    public static Order creatOrder(Shop shop, Header header, Customer customer, List<Item> items) {

        Order order = new Order();

        order.getShops().add(shop);
        order.getHeaders().add(header);
        order.getCustomers().add(customer);

        for (Item item : items) {
            order.getItems().add(item);
        }

        return order;

    }

    // Bloque 1 de Order
    public static Shop createShop(int shopNo) {
        return new Shop(shopNo);
    }

    // --------------------------------------------------------------------------------------------
    // Header
    // Bloque 2 de Order
    public static Header createHeader(String business, String salesChannel, String division, String orderType,
            String orderReason, String dispatchType, String paymentType, String orderNo, String transNo,
            String orderTimestamp, PaymentDetail paymentDetail, HeaderPrice headerPrice) {

        Header header = new Header(business, salesChannel, division, orderType, orderReason, dispatchType, paymentType,
                orderNo,
                transNo, orderTimestamp);

        header.getPaymentDetails().add(paymentDetail);
        header.getHeaderPrices().add(headerPrice);

        return header;

    }

    // Bloque 1 de Header
    public static PaymentDetail createPaymentDetail(String paymentToken, String creditCard, String cardOwner,
            String authAmount, String authorisationCode, String authorisationDate, String authorisationTime,
            String authorisationRef) {
        return new PaymentDetail(paymentToken, creditCard, cardOwner, authAmount, authorisationCode, authorisationDate,
                authorisationTime, authorisationRef);
    }

    // Bloque 2 de Header
    public static HeaderPrice createHeaderPrice(String currency, String headerNet, String headerNetOriginal,
            String headerGross, String headerGrossOriginal, String subTotalGross, String headerVatRate,
            String headerVatValue, String carrierGross) {
        return new HeaderPrice(currency, headerNet, headerNetOriginal, headerGross, headerGrossOriginal, subTotalGross,
                headerVatRate, headerVatValue, carrierGross);
    }
    // --------------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------------
    // Customer
    // Bloque 3 de Order
    public static Customer createCustomer(String custumerNo, String customerTyp, String identityTyp, String identityNo,
            String shippingAndBillingEqual, BillingAddress billingAddress, ShippingAddress shippingAddress) {
        Customer customer = new Customer(custumerNo, customerTyp, identityTyp, identityNo, shippingAndBillingEqual);

        customer.getBillingAddresses().add(billingAddress);
        customer.getShippingAdresses().add(shippingAddress);

        return customer;
    }

    public static BillingAddress createBillingAddress(String billingFirstName, String billingLastname, String billingCompany,
            String billingStreet, String billingStreetNo, String billingBuilding, String billingDigicode,
            String billingAddressExtension2, String billingAddressExtension1, String billingPoBox, String billingZIP,
            String billingCity, String billingRegion, String billingCountry, String billingLanguage,
            String billingEmail, String billingTelNo, String billingBirthday) {
        return new BillingAddress(billingFirstName, billingLastname, billingCompany, billingStreet, billingStreetNo,
                billingBuilding, billingDigicode, billingAddressExtension2, billingAddressExtension1, billingPoBox,
                billingZIP, billingCity, billingRegion, billingCountry, billingLanguage, billingEmail, billingTelNo,
                billingBirthday);
    }

    public static ShippingAddress createShippingAddress(String shippingFirstName, String shippingLastname,
            String shippingCompany, String shippingStreet, String shippingStreetNo, String shippingBuilding,
            String shippingDigicode, String shippingAddressExtension2, String shippingAddressExtension1,
            String shippingPoBox, String shippingZIP, String shippingCity, String shippingRegion,
            String shippingCountry, String shippingLanguage, String shippingEmail, String shippingTelNo) {
        return new ShippingAddress(shippingFirstName, shippingLastname, shippingCompany, shippingStreet,
                shippingStreetNo, shippingBuilding, shippingDigicode, shippingAddressExtension2,
                shippingAddressExtension1, shippingPoBox, shippingZIP, shippingCity, shippingRegion, shippingCountry,
                shippingLanguage, shippingEmail, shippingTelNo);
    }
    // Customer
    // --------------------------------------------------------------------------------------------

    // --------------------------------------------------------------------------------------------
    // Item
    public static Item creaItem(String deliveryItemNumber, String orderItemType, String orderAvailDateItem, String articleNo,
            String salesText, String serial, String gCRSTicketNo, String quantity, String quantityUnit,
            String stockAssign, String itemNet, String itemNetOriginal, String itemNetPerUnit,
            String itemNetPerUnitOriginal, String itemGross, String itemGrossOriginal, String itemGrossPerUnit,
            String itemGrossPerUnitOriginal, ItemVat itemVat) {
        Item item = new Item(deliveryItemNumber, orderItemType, orderAvailDateItem, articleNo, salesText, serial,
                gCRSTicketNo, quantity, quantityUnit, stockAssign, itemNet, itemNetOriginal, itemNetPerUnit,
                itemNetPerUnitOriginal, itemGross, itemGrossOriginal, itemGrossPerUnit, itemGrossPerUnitOriginal);

        item.getItemVat().add(itemVat);

        return item;
    }

    public static ItemVat creaItemVat(String itemVatRate, String itemVatValue, String originalItemVatPerUnit,
            String itemVatPerUnit, String originalItemVatValue) {
        return new ItemVat(itemVatRate, itemVatValue, originalItemVatValue, itemVatPerUnit, originalItemVatPerUnit);
    }
    // --------------------------------------------------------------------------------------------
}
