package com.epam.ReadWrite.JSON;

/**
 * Created by Maryia on 12/4/2015.
 */
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Maryia on 11/26/2015.
 */

/**
 * Created by Maryia on 11/24/2015.
 */
public class ReadFromFile {
    public static List<String> name = new ArrayList<String>();
    public static List<String> calories = new ArrayList<String>();
    public static Map map = new HashMap<String, Double>();
    public double reqcalories = 0;

    public static void readFromFile() throws IOException {

        JsonFactory jfactory = new JsonFactory();
        JsonParser jParser = jfactory.createJsonParser(new File("src/com/epam/ReadWrite/JSON/Ingridients.json"));

        for (int i = 0; i <= 2; i++) {
            while (jParser.nextToken() != JsonToken.END_ARRAY) {

                String fieldname = jParser.getCurrentName();
                if ("name".equals(fieldname)) {
                    jParser.nextToken();
                    name.add(jParser.getText());
                }
                if ("calories".equals(fieldname)) {
                    jParser.nextToken();
                    calories.add(jParser.getText());

                }
            }

        }

        if (name.size() == calories.size()) {
            for (int index = 0; index < name.size(); index++) {
                map.put(name.get(index), Double.parseDouble(calories.get(index)));

            }
        }
        //System.out.println(name);
    }

    //return (Double) map.get(type);
    public List getName() {
        return name;
    }

    public static void main() throws IOException {
        readFromFile();
    }

}
