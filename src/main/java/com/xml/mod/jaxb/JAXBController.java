package com.xml.mod.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBController {

    public static void marshallXML(Class<?> marshallClass, Object object, File file) {
        try {
            JAXBContext context = JAXBContext.newInstance(marshallClass);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", false);
            marshaller.setProperty("com.sun.xml.bind.xmlHeaders",
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            marshaller.marshal(object, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static <T> T unmarshallXML(Class<T> unmarshallClass, File file) {

        Object object = null;
        try {
            JAXBContext context = JAXBContext.newInstance(unmarshallClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            object = unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        if (object == null) {
            return null;
        } else {
            if (unmarshallClass.isInstance(object)) {
                return unmarshallClass.cast(object);
            } else {
                return null;
            }
        }

    }

}
