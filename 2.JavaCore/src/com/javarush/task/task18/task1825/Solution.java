package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> map = new TreeMap<>();
        String name = reader.readLine();
        String[] nameFile = name.split(".part+\\d+");
        while (!name.equals("end")) {
            String[] numFile = name.split("\\.part");
            map.put(Integer.parseInt(numFile[1]),name);
            name = reader.readLine();
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile[0]));
        for (Map.Entry<Integer, String> pair : map.entrySet()){
            BufferedReader reader1 = new BufferedReader(new FileReader(pair.getValue()));
            while (reader1.ready()) {
                writer.write(reader1.readLine());
            }
            reader1.close();
        }
        writer.close();
    }
}
