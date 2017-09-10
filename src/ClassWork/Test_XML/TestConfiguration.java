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

        MyConfiguration configuration = MyConfiguration.create("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/Test_XML/conf.xml");
        System.out.println(configuration.getDirectory());
        System.out.println(configuration.getExtension());
        File myFile = new File(configuration.getDirectory());
        File [] path = myFile.listFiles();

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/Test_XML/output.json"));

        String myString = "";

        for (int i = 0; i < path.length; i++) {

            if (path[i].getName().endsWith(configuration.getExtension())) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path[i]))){
                    myString += reader.readLine();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


        }
        String upperCase = "";
        String lowerCase = "";
        for (int j = 0; j < myString.length(); j++ ){

            if (Character.isUpperCase(myString.charAt(j))){
                upperCase += myString.charAt(j);

            } else if (Character.isLowerCase(myString.charAt(j))) {
                lowerCase += myString.charAt(j);
            }
        }
        jsonObject.put("upper",upperCase);
        jsonObject.put("lower",lowerCase);

        System.out.println(jsonObject);

        try (FileWriter fileWriter = new FileWriter("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/Test_XML/output.json")) {
            jsonObject.writeJSONString(fileWriter);
        }


    }

}
