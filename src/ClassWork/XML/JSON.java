package ClassWork.XML;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by java6 on 31.08.17.
 */
public class JSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/XML/Countries.json"));

        JSONObject usa = (JSONObject) jsonObject.get("USA");
        System.out.println(usa);
        usa.putIfAbsent("South", "Texas");
        System.out.println(usa);

        try (FileWriter fileWriter = new FileWriter("C:/Users/kravchuk/IdeaProjects/java_elementary/src/ClassWork/XML/Countries.json")) {
            jsonObject.writeJSONString(fileWriter);
        }

    }

}
