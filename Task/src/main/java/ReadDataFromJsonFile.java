import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJsonFile {


    public ReadDataFromJsonFile() throws IOException, ParseException {
    }

    public static String ReadDataFromJsonFile(String key) throws IOException, ParseException {
        JSONParser jsonpareser = new JSONParser();

        FileReader reader = new FileReader("testData.json");

        Object obj = jsonpareser.parse(reader);

        JSONObject empjsonobj = (JSONObject) obj;

        return (String) empjsonobj.get(key);
    }
}
