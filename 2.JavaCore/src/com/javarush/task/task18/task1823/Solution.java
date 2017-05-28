package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file = reader.readLine();
            while (!file.equals("exit")){
                ReadThread readThread = new ReadThread(file);
                readThread.start();
                file = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream file = new FileInputStream(fileName);
                TreeMap<Integer, Integer> map = new TreeMap<>();
                while (file.available()>0){
                    int key = file.read();
                    if (map.containsKey(key))
                        map.put(key, map.get(key)+1);
                    else map.put(key, 1);
                }
                file.close();
                TreeMap<Integer, Integer> treeMap = new TreeMap<>();
                for (Map.Entry<Integer, Integer> pair : map.entrySet()){
                    treeMap.put(pair.getValue(), pair.getKey());
                }
                resultMap.put(fileName, treeMap.get(treeMap.lastKey()));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }   catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
