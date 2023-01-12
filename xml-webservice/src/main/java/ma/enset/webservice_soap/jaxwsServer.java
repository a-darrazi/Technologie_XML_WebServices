package ma.enset.webservice_soap;

import jakarta.xml.ws.Endpoint;

public class jaxwsServer {
    public static final String URL = "http://0.0.0.0:7743/ws";
    public static void main(String[] args) {
        Endpoint publish = Endpoint.publish(URL, new BanqueWS());
        if(publish.isPublished()){
            System.out.println("web service run on : "+URL);
            System.out.println("wsdl from local: http://localhost:7743/ws/BanqueWS?wsdl");
        }
        else
            System.err.println("somethings is wrong");
    }
}
