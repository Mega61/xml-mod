package com.xml.mod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.xml.mod.factory.OrderFactory;
import com.xml.mod.orderrequestcomponents.OrderRequest;
import com.xml.mod.orderrequestcomponents.ordercomponents.itemcomponents.Item;

/**
 * Hello world!
 *
 */
public class App {
        public static void main(String[] args) {
                int decider = 0;
                decider = Integer
                                .parseInt(JOptionPane.showInputDialog(null,
                                                "1. Marshalling \n2. Unmarshalling \n3. Modify XML"));
                if (decider == 1) {
                        try {
                                List<Item> items = new ArrayList<>();

                                File file = new File("generated-orders/eCommerceRRP TEST2.xml");

                                JAXBContext context = JAXBContext.newInstance(OrderRequest.class);

                                Marshaller marshaller = context.createMarshaller();

                                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                                marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
                                marshaller.setProperty("com.sun.xml.bind.xmlHeaders",
                                                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

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

                                        Marshaller marshaller = context.createMarshaller();
                                        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                                        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
                                        marshaller.setProperty("com.sun.xml.bind.xmlHeaders",
                                                        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

                                        marshaller.marshal(orderRequest, saveFile);

                                        System.out.println("Order "
                                                        + orderRequest.getOrders().get(0).getHeaders().get(0)
                                                                        .getOrderNo()
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
