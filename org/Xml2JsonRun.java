package org;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by ozlevka on 10/22/14.
 */
public class Xml2JsonRun {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;


    public static void main(String[] args) {
        try {
            byte[] allBytes = Files.readAllBytes(Paths.get("/home/ozlevka/Downloads/earthquakes.xml"));
            String xml =  new String(allBytes, 0, allBytes.length, Charset.forName("UTF-8"));
            JSONObject obj = XML.toJSONObject(xml);
            System.out.println(obj.toString(PRETTY_PRINT_INDENT_FACTOR));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
