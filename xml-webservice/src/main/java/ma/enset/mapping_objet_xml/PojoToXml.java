package ma.enset.mapping_objet_xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import ma.enset.common.entities.Operation;
import ma.enset.common.entities.Operations;
import ma.enset.common.entities.Releve;
import ma.enset.common.enums.OperationType;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

public class PojoToXml {
    public static void main(String[] args) throws JAXBException {
        Releve releve = new Releve("4036263287458963", LocalDate.now(), 5500,
                new Operations(LocalDate.now(), LocalDate.now(),
                        List.of(
                                new Operation(LocalDate.now(), 300, "operation 1", OperationType.CREDIT),
                                new Operation(LocalDate.now(), 100, "operation 2", OperationType.CREDIT),
                                new Operation(LocalDate.now(), 1500, "operation 3", OperationType.CREDIT),
                                new Operation(LocalDate.now(), 3700, "operation 4", OperationType.DEBIT),
                                new Operation(LocalDate.now(), 2500, "operation 5", OperationType.DEBIT)
                        )));

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));

        System.out.println("releve.xml is created successfully");
    }
}
