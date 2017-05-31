package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
        fileInputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties properties1 = new Properties();
        properties1.putAll(properties);
        properties1.store(outputStream,"");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties1 = new Properties();
        properties1.load(inputStream);
        properties.putAll((Map)properties1);
    }

    public static void main(String[] args) {

    }
}
