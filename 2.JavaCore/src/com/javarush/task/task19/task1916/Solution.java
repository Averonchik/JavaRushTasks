package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine(), file2 = reader.readLine();
        reader.close();
        BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
        BufferedReader file2Reader = new BufferedReader(new FileReader(file2));
        ArrayList<String> file1List = new ArrayList<>();
        ArrayList<String> file2List = new ArrayList<>();
        while (file1Reader.ready()) file1List.add(file1Reader.readLine());
        file1Reader.close();
        while (file2Reader.ready()) file2List.add(file2Reader.readLine());
        file2Reader.close();
        while (0 < file1List.size()){
            if (file2List.size()==0){
                lines.add(new LineItem(Type.REMOVED, file1List.get(0)));
                file1List.remove(0);
            } else if (file1List.get(0).equals(file2List.get(0))) {
                lines.add(new LineItem(Type.SAME, file1List.get(0)));
                file1List.remove(0);
                file2List.remove(0);
            } else if (file1List.get(0).equals(file2List.get(1))){
                lines.add(new LineItem(Type.ADDED, file2List.get(0)));
                file2List.remove(0);
            } else if (!file1List.get(0).equals(file2List.get(1))&&!file1List.get(0).equals(file2List.get(0))){
                lines.add(new LineItem(Type.REMOVED, file1List.get(0)));
                file1List.remove(0);
            }
        }
        while (file2List.size()>0) {
            lines.add(new LineItem(Type.ADDED, file2List.get(0)));
            file2List.remove(0);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
