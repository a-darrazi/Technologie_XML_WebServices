package ma.enset.mapping_objet_xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import ma.enset.common.entities.Releve;

import java.io.File;

public class XmlToPojo {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshal = unmarshaller.unmarshal(new File("releve.xml"));

        Releve releve = unmarshal instanceof Releve ? (Releve) unmarshal : null;
        if(releve == null) return;

        System.out.println(releve);
        System.out.println("\t"+releve.getOperations());
        releve.getOperations().getOperations().forEach(o->{
            System.out.println("\t\t"+o);
        });

    }
}
