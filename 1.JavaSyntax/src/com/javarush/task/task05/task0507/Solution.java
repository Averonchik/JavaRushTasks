package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> numbers = new ArrayList();

        while (true) {
            Double a = Double.parseDouble(reader.readLine());
            if (a==-1)
                break;
            else numbers.add(a);
        }
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        double average = sum / numbers.size();
        System.out.println(average);
    }
}

