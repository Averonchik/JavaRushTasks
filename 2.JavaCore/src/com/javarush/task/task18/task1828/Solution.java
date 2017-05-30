package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/


import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> map = new ArrayList<>();
        String lastLine;
        if (args[0].equals("-u")){
            while (fileReader.ready()){
                lastLine = fileReader.readLine();
                if ((lastLine.substring(0,8).trim()).equals(args[1]))
                    map.add(String.format("%-8d%-30s%-8s%-4s",Integer.parseInt(args[1]), args[2], args[3],args[4]));
                else map.add(lastLine);
            }
        }else if (args[0].equals("-d")){
            while (fileReader.ready()){
                lastLine = fileReader.readLine();
                if (!(lastLine.substring(0,8).trim()).equals(args[1]))
                    map.add(lastLine);
            }
        }
        fileReader.close();
        BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < map.size(); i++) {
            fileOutputStream.write(map.get(i)+"\n");
        }
        fileOutputStream.close();
    }
}
