package ClassWork.XML;

import org.w3c.dom.Document;
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
        NodeList nodes = doc.getElementsByTagName("cars");
        Node node = nodes.item(0);
        System.out.println(node.getNodeName());
        System.out.println(node.getAttributes());
        System.out.println(node.getChildNodes());


    }

}
