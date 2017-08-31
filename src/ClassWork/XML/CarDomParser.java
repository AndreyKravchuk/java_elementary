package ClassWork.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * Created by java6 on 28.08.17.
 */
public class CarDomParser {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("/home/java6/IdeaProjects/java_elementary1/src/ClassWork/XML/MyXML.xml");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();


        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("car");



        for (int i = 0; i < nList.getLength(); i++) {

            Node nNode = nList.item(i);

            System.out.println("\nCurrent Element :" + nNode.getNodeName());



            Element eElement = (Element) nNode;

            System.out.println("id : " + eElement.getAttribute("id"));
            System.out.println("name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
            System.out.println("speed : " + eElement.getElementsByTagName("speed").item(0).getTextContent());
            System.out.println("birthdate : " + eElement.getElementsByTagName("birthdate").item(0).getTextContent());


        }
    }

}
