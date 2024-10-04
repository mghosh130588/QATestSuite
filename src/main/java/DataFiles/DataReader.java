package DataFiles;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public abstract class DataReader {

    public List<HashMap<String, String>> getJsonToMap() throws IOException {
        String JsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir") +"\\src\\main\\java\\DataFiles\\SubmitOrder.json"), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String,String>> data =mapper.readValue(JsonContent, new TypeReference<List<HashMap<String ,String>>>() {
        });
        return data;
    }
    public String[][] readJson(String filepath) throws IOException, ParseException {
        JSONParser parser =new JSONParser();
        FileReader fr = new FileReader(filepath);
        Object object = parser.parse(fr);
        JSONArray jsondata = (JSONArray) object;
        int number = jsondata.size();
        String[][] dataobj = new String[number][3];
        for (int i =0;i<number;i++)
        {
            JSONObject js = (JSONObject)jsondata.get(i);
            dataobj[i][0] = (String)js.get("email");
            dataobj[i][1] = (String)js.get("password");
            dataobj[i][2] = (String)js.get("product");
        }
        return dataobj;

    }

}
