package ma.enset.webservice_soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import ma.enset.common.entities.Releve;

import java.io.File;


@WebService(name = "BanqueWS")
public class BanqueWS {

    @WebMethod(action = "findByRIB")
    public Releve findRelveByRib(@WebParam(name = "RIB") String RIB) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshal = unmarshaller.unmarshal(new File("releve.xml"));

        return unmarshal instanceof Releve ? (Releve) unmarshal : null;
    }



}
