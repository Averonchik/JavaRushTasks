package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int max = 0;
        int min = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()>strings.get(max).length())
                max = i;
            if (strings.get(i).length()<strings.get(min).length())
                min = i;
        }
        if (max<min)
            System.out.println(strings.get(max));
        else System.out.println(strings.get(min));
    }
}
