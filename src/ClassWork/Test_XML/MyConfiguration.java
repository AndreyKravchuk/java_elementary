package ClassWork.Test_XML;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * Created by java6 on 07.09.17.
 */
public class MyConfiguration {
        private String directory;
        private String extension;

        private MyConfiguration (String directory, String extension){
                this.directory = directory;
                this.extension = extension;
        }

        public MyConfiguration() {

        }

        public static MyConfiguration create(String xmlConf) throws ParserConfigurationException, IOException, SAXException {
                File inputFile = new File(xmlConf);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(inputFile);
                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("configuration");

                String ext = null;
                String dir = null;
                for (int i = 0; i < nList.getLength(); i++) {

                        Node nNode = nList.item(i);
                        Element eElement = (Element) nNode;

                        dir = eElement.getElementsByTagName("directory").item(0).getTextContent();
                        ext = eElement.getElementsByTagName("extension").item(0).getTextContent();

                }
                MyConfiguration myConfiguration = new MyConfiguration(dir, ext);
                return myConfiguration;
        }

        public String getDirectory(){
               return directory;
        }

        public String getExtension(){
                return extension;
        }


}
