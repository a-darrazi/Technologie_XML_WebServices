<h1 align="center">Technologie_XML_WebServices</h1>

### partie 1 - Technologie_XML_:

#### la structure graphique de l’arbre XML
<img src="Partie 1 Technologie XML/1.structure graphique de l’arbre XML.PNG"/>

## le dossier < Partie 1 Technologie XML > contient banque xml, dtd, xsd, xsl

## le dossier < xml-webservice > c'est un maven java projet 

#### package ma.enset.common.entities contient les classes Releve, Operations et Operation

#### package ma.enset.mapping_objet_xml contient 3 java classes 
  - PojoToXml.java : serialize java Releve to xml and save it in a file in the same project with the name - releve.xml -
  - XmlToPojo.java : deserialize - releve.xml - to java Releve class 
  - GenerateXmlSchema.java : class for generate schema xml from Releve class

#### package ma.enset.webservice_soap contient deux classes BanqueWS.java et jaxwsServer.java

#### package ma.enset.webservice_rest_spark 
