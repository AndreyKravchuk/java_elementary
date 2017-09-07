package ClassWork.Test_XML;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.List;

/**
 * Created by java6 on 07.09.17.
 */
public class TestConfiguration {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, ParseException {

        MyConfiguration configuration = MyConfiguration.create("/home/java6/IdeaProjects/java_elementary1/src/ClassWork/Test_XML/conf.xml");
        System.out.println(configuration.getDirectory());
        System.out.println(configuration.getExtension());
        File myFile = new File(configuration.getDirectory());
        File [] path = myFile.listFiles();
        for (int i=0; i < path.length; i++ ){
            if (path[i].getName().endsWith(configuration.getExtension())){
                try (BufferedReader br = new BufferedReader(new FileReader(path[i]));
                     



                }
            }
        }



    }

}
