package com.xml.mod;

import java.io.File;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

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

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int decider = 0;
        decider = Integer
                .parseInt(JOptionPane.showInputDialog(null, "1. Marshalling \n2. Unmarshalling \n3. Modify XML"));
        if (decider == 1) {
            try {
                File file = new File("generated-orders/eCommerceRRP TEST2.xml");

                JAXBContext context = JAXBContext.newInstance(OrderRequest.class);

                Marshaller marshaller = context.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
                marshaller.setProperty("com.sun.xml.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

                OrderRequest orderRequest = new OrderRequest(
                        "prod",
                        1);

                Order order = new Order();

                Shop shop = new Shop(1);
                Header header = new Header(
                        "9190",
                        "01",
                        "01",
                        "ZTA",
                        "R01",
                        "ND",
                        "Z006",
                        "13062210",
                        "",
                        "2022-06-13T02:54:00");
                PaymentDetail paymentDetail = new PaymentDetail(
                        "",
                        "",
                        "",
                        "72777.0000",
                        "",
                        "",
                        "",
                        "");

                HeaderPrice headerPrice = new HeaderPrice(
                        "COP",
                        "117647.06",
                        "117647.06",
                        "72777.0000",
                        "140000",
                        "72777.0000",
                        "19.000",
                        "22352.94",
                        "0.00");

                Customer customer = new Customer(
                        "00973251",
                        "B2C",
                        "Cédula de Ciudadanía",
                        "745735727",
                        "01");

                BillingAddress billingAddress = new BillingAddress(
                        "eCommRRP BILLING NAME",
                        "eCommRRP  BILLING LASTNAME",
                        "",
                        "CALLE  71 #65 - 98 Apto 202 Barrio San Francisco",
                        "",
                        "",
                        "",
                        "ATLANTICO",
                        "",
                        "",
                        "",
                        "BARRANQUILLA",
                        "",
                        "CO",
                        "es",
                        "otv_pruebas@yopmail.com",
                        "3105414567",
                        "19810101");

                ShippingAddress shippingAddress = new ShippingAddress(
                        "eCommRRP SHIPPING NAME",
                        "eCommRRP SHIPPING LASTNAME",
                        "",
                        "TEST SHIPPING ADDRESS 1",
                        "",
                        "",
                        "",
                        "BOGOTÁ",
                        "",
                        "",
                        "",
                        "BOGOTÁ",
                        "",
                        "CO",
                        "es",
                        "otv_pruebas@yopmail.com",
                        "3105414567");

                Item item = new Item(
                        "1",
                        "",
                        "",
                        "ME001232.00",
                        "HEETS Turquoise Selection (cartón)",
                        "",
                        "",
                        "1",
                        "",
                        "3010",
                        "117647.06",
                        "117647.06",
                        "58823.53",
                        "58823.53",
                        "75000.0000",
                        "75000.0000",
                        "75000.0000",
                        "75000.0000");

                ItemVat itemVat = new ItemVat(
                        "19.000",
                        "22352.94",
                        "22352.94",
                        "11176.47",
                        "11176.47");

                header.getPaymentDetails().add(paymentDetail);
                header.getHeaderPrices().add(headerPrice);

                customer.getBillingAddresses().add(billingAddress);
                customer.getShippingAdresses().add(shippingAddress);

                item.getItemVat().add(itemVat);

                order.getShops().add(shop);
                order.getHeaders().add(header);
                order.getCustomers().add(customer);
                order.getItems().add(item);

                orderRequest.getOrders().add(order);

                marshaller.marshal(orderRequest, file);

                JOptionPane.showMessageDialog(null, "Creación de XML completada");

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        } else if (decider == 2) {
            try {
                File file = new File("read-orders/eCommRRP.xml");

                JAXBContext context = JAXBContext.newInstance(OrderRequest.class);

                Unmarshaller unmarshaller = context.createUnmarshaller();

                OrderRequest orderRequest = (OrderRequest) unmarshaller.unmarshal(file);

                System.out.println(orderRequest.getOrders().get(0).getHeaders().get(0).getOrderNo());
                System.out.println(orderRequest);
            } catch (JAXBException e) {
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(null, "Lectura de XML completada");
        } else if (decider == 3) {
            for (int i = 1; i < 71; i++) {
                try {

                    File file = new File("read-orders/Original/orderSC (" + i + ").xml");

                    JAXBContext context = JAXBContext.newInstance(OrderRequest.class);

                    Unmarshaller unmarshaller = context.createUnmarshaller();

                    OrderRequest orderRequest = (OrderRequest) unmarshaller.unmarshal(file);

                    File saveFile = new File("read-orders/Modified/Premium Delivery/order_SC"
                            + orderRequest.getOrders().get(0).getHeaders().get(0).getOrderNo() + ".xml");

                    orderRequest.getOrders().get(0).getCustomers().get(0).getBillingAddresses().get(0)
                            .setBillingEmail("diana.gomez@pmi.com");
                    orderRequest.getOrders().get(0).getCustomers().get(0).getBillingAddresses().get(0)
                            .setBillingTelNo("3146170237");

                    orderRequest.getOrders().get(0).getCustomers().get(0).getShippingAdresses().get(0)
                            .setShippingEmail("diana.gomez@pmi.com");
                    orderRequest.getOrders().get(0).getCustomers().get(0).getShippingAdresses().get(0)
                            .setShippingTelNo("3146170237");

                    orderRequest.getOrders().get(0).getHeaders().get(0).setOrderTimestamp("2022-06-15T12:00:00");

                    Marshaller marshaller = context.createMarshaller();
                    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                    marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
                    marshaller.setProperty("com.sun.xml.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

                    marshaller.marshal(orderRequest, saveFile);

                    System.out.println("Order " + orderRequest.getOrders().get(0).getHeaders().get(0).getOrderNo()
                            + " Modificada - Iteración " + i);

                } catch (JAXBException e) {
                    e.printStackTrace();
                    System.out.println("Iteración " + i + " fallida");
                }
            }
            JOptionPane.showMessageDialog(null, "Modificación exitosa");

        } else {
            JOptionPane.showMessageDialog(null, "Error no se ha ingresado un valor correcto");
        }

    }
}
