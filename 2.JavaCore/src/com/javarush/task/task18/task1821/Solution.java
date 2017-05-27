package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Map<Integer, Integer> ascii = new TreeMap<>();
        try {
            FileInputStream file = new FileInputStream(args[0]);
            while (file.available()>0){
                int b = file.read();
                if (ascii.containsKey(b))
                    ascii.put(b, ascii.get(b)+1);
                else ascii.put(b, 1);
            }
            file.close();

            for (Map.Entry<Integer, Integer> pair : ascii.entrySet()){
                char ch = (char) (Byte.parseByte(String.valueOf(pair.getKey())));
                System.out.println(ch  + " " + pair.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
