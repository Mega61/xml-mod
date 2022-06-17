package com.xml.mod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.xml.mod.factory.OrderFactory;
import com.xml.mod.jaxb.JAXBController;
import com.xml.mod.orderrequestcomponents.OrderRequest;
import com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents.Item;

public class App {
        public static void main(String[] args) {
                int decider = 0;
                decider = Integer
                                .parseInt(JOptionPane.showInputDialog(null,
                                                "1. Marshalling \n2. Unmarshalling \n3. Modify XML"));
                if (decider == 1) {

                        List<Item> items = new ArrayList<>();

                        File file = new File("generated-orders/eCommerceRRP TEST3.xml");

                        items.add((OrderFactory.creaItem(
                                        "1",
                                        "",
                                        "",
                                        "ME001231.08",
                                        "HEETS AMBERSEL S50 PRI 20 SLI",
                                        "ME001231.08",
                                        "",
                                        "4",
                                        "",
                                        "3010",
                                        "132709.2",
                                        "132709.2",
                                        "132709.2",
                                        "132709.2",
                                        "300000",
                                        "300000",
                                        "75000",
                                        "75000",
                                        OrderFactory.creaItemVat(
                                                        "19",
                                                        "25214.748",
                                                        "300000",
                                                        "25214.748",
                                                        "25214.748"))));

                        OrderRequest orderRequest = OrderFactory.creatOrderRequest(
                                        "prod",
                                        1,
                                        OrderFactory.creatOrder(
                                                        OrderFactory.createShop(1),
                                                        OrderFactory.createHeader(
                                                                        "9190",
                                                                        "01",
                                                                        "01",
                                                                        "ZTA",
                                                                        "R01",
                                                                        "ND",
                                                                        "Z098",
                                                                        "SC1002906810",
                                                                        "",
                                                                        "2022-06-15T12:00:00",
                                                                        OrderFactory.createPaymentDetail(
                                                                                        "",
                                                                                        "",
                                                                                        "",
                                                                                        "300000",
                                                                                        "",
                                                                                        "",
                                                                                        "",
                                                                                        ""),
                                                                        OrderFactory.createHeaderPrice(
                                                                                        "COP",
                                                                                        "300000",
                                                                                        "300000",
                                                                                        "300000",
                                                                                        "300000",
                                                                                        "300000",
                                                                                        "19",
                                                                                        "60733.748",
                                                                                        "0.00")),
                                                        OrderFactory.createCustomer(
                                                                        "00097570",
                                                                        "B2C",
                                                                        "Cedula de Ciudadania",
                                                                        "427633611",
                                                                        "01",
                                                                        OrderFactory.createBillingAddress(
                                                                                        "LUZ",
                                                                                        "RESTREPO",
                                                                                        "",
                                                                                        "CR 27 D No 34DD SUR-44 AP 801 ED REFUGIO VERDE BR LA INMACULADA",
                                                                                        "",
                                                                                        "",
                                                                                        "",
                                                                                        "ANTIOQUIA",
                                                                                        "",
                                                                                        "",
                                                                                        "",
                                                                                        "ENVIGADO",
                                                                                        "",
                                                                                        "CO",
                                                                                        "es",
                                                                                        "jdazap@choucairtesting.com",
                                                                                        "3204514446",
                                                                                        "19640625"),
                                                                        OrderFactory.createShippingAddress(
                                                                                        "LUZ",
                                                                                        "RESTREPO",
                                                                                        "",
                                                                                        "CR 27 D No 34DD SUR-44 AP 801 ED REFUGIO VERDE BR LA INMACULADA",
                                                                                        "",
                                                                                        "Edificio",
                                                                                        "",
                                                                                        "ANTIOQUIA",
                                                                                        "",
                                                                                        "",
                                                                                        "",
                                                                                        "ENVIGADO",
                                                                                        "",
                                                                                        "CO",
                                                                                        "es",
                                                                                        "jdazap@choucairtesting.com",
                                                                                        "3146170237")),
                                                        items));

                        JAXBController.marshallXML(OrderRequest.class, orderRequest, file);

                        JOptionPane.showMessageDialog(null, "Creación de XML completada");

                } else if (decider == 2) {

                        File file = new File("read-orders/order_02035004017.xml");

                        OrderRequest orderRequest = JAXBController.unmarshallXML(OrderRequest.class, file);

                        System.out.println(orderRequest.toString());
                        System.out.println(orderRequest.getOrders().get(0).getHeaders().get(0).getOrderNo());

                        JOptionPane.showMessageDialog(null, "Lectura de XML completada");
                } else if (decider == 3) {
                        for (int i = 1; i < 7; i++) {

                                File file = new File("read-orders/Original/order (" + i + ").xml");

                                OrderRequest orderRequest = JAXBController.unmarshallXML(OrderRequest.class, file);

                                File saveFile = new File("read-orders/Modified/order_"
                                                + orderRequest.getOrders().get(0).getHeaders().get(0)
                                                                .getOrderNo()
                                                + ".xml");

                                orderRequest.getOrders().get(0).getCustomers().get(0).getBillingAddresses()
                                                .get(0)
                                                .setBillingEmail("diana.gomez@pmi.com");
                                orderRequest.getOrders().get(0).getCustomers().get(0).getBillingAddresses()
                                                .get(0)
                                                .setBillingTelNo("3146170237");

                                orderRequest.getOrders().get(0).getCustomers().get(0).getShippingAdresses()
                                                .get(0)
                                                .setShippingEmail("diana.gomez@pmi.com");
                                orderRequest.getOrders().get(0).getCustomers().get(0).getShippingAdresses()
                                                .get(0)
                                                .setShippingTelNo("3146170237");

                                orderRequest.getOrders().get(0).getHeaders().get(0)
                                                .setOrderTimestamp("2022-06-15T12:00:00");

                                JAXBController.marshallXML(OrderRequest.class, orderRequest, saveFile);

                                System.out.println("Order "
                                                + orderRequest.getOrders().get(0).getHeaders().get(0)
                                                                .getOrderNo()
                                                + " Modificada - Iteración " + i);

                        }
                        JOptionPane.showMessageDialog(null, "Modificación exitosa");

                } else {
                        JOptionPane.showMessageDialog(null, "Error no se ha ingresado un valor correcto");
                }

        }
}
