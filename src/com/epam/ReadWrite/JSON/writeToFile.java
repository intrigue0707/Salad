package com.epam.ReadWrite.JSON;

import com.epam.Exceptions.MyIOEforstring;
import com.epam.addingToList;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;

import java.io.File;
import java.io.IOException;

/**
 * Created by Maryia on 11/27/2015.
 */
public class writeToFile {
    public static void writeToFile() throws IOException, MyIOEforstring {
        addingToList sal= new addingToList();
        ObjectMapper mapper = new ObjectMapper();
        JsonFactory jfactory = new JsonFactory();
        JsonParser jParser = jfactory.createJsonParser(new File("src/com/epam/ReadWrite/Ingridients.json"));
        JsonNode root = mapper.readTree(jParser);
        ObjectNode newNode = mapper.createObjectNode();
        newNode.put("name", sal.getJIngr());
        newNode.put("calories", sal.getJcalories());
        JsonNode contactNode = root.path(addingToList.jcategory);
        ((ArrayNode) contactNode).add(newNode);
        mapper.writeValue(new File("src/com/epam/ReadWrite/JSON/Ingridients.json"), root);

    }

    public static void main() throws IOException, MyIOEforstring {
        writeToFile();
    }
}
