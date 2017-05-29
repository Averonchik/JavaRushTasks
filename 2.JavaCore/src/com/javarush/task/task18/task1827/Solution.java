package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        String lastLine;
        int maxId = 0;
        while (fileReader.ready()) {
            lastLine = fileReader.readLine();
            list.add(lastLine);
            if (maxId<Integer.parseInt(lastLine.substring(0,8).trim()))
                maxId=Integer.parseInt(lastLine.substring(0,8).trim());
        }
        fileReader.close();
        list.add(String.format("%-8d%-30s%-8s%-4s", ++maxId, args[1], args[2], args[3]));
        BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < list.size(); i++) {
            fileOutputStream.write(list.get(i)+"\n");
        }
        fileOutputStream.close();
    }
}
