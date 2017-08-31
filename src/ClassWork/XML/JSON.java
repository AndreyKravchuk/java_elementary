package ClassWork.XML;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by java6 on 31.08.17.
 */
public class JSON {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        JSONObject obj = (JSONObject) jsonParser.parse(new FileReader("/home/java6/IdeaProjects/java_elementary1/src/ClassWork/XML/Countries.json"));

        System.out.println(obj.get("USA"));
        System.out.println(obj.containsKey("USA"));
    }

}
