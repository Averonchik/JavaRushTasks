package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
            BufferedReader fileReader1 = new BufferedReader(new FileReader(reader.readLine()));
            reader.close();
            while (fileReader.ready()){
                allLines.add(fileReader.readLine());
            }
            while (fileReader1.ready()){
                forRemoveLines.add(fileReader1.readLine());
            }
            fileReader.close();
            fileReader1.close();
        } catch (IOException e) {
        }
        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
