package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i-1).length()>words.get(i).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

