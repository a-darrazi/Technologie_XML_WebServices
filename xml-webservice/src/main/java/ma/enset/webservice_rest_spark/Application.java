package ma.enset.webservice_rest_spark;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import ma.enset.common.entities.Releve;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) throws JAXBException {
        port(4433);

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshal = unmarshaller.unmarshal(new File("releve.xml"));
        Releve releve = unmarshal instanceof Releve ? (Releve) unmarshal : null;

        get("/getReleve", (request, response) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("releve", releve);
            map.put("operations", releve.getOperations().getOperations());
            return  map;
        });
    }
}
