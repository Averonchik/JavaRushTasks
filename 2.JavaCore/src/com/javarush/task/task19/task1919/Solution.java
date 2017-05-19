package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String[] readString;
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready()){
            readString = reader.readLine().split(" ");
            if (map.containsKey(readString[0])) {
                double mapValue = map.get(readString[0]) + Double.valueOf(readString[1]);
                map.replace(readString[0], mapValue);
            } else map.put(readString[0], Double.valueOf(readString[1]));
        }
        reader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
