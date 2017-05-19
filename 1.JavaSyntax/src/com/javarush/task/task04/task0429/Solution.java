package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine()), num2 = Integer.parseInt(reader.readLine()),num3 =Integer.parseInt(reader.readLine());

        int countPlus = 0, countMinus = 0;

        if (num1<0)
            countMinus++;
        else if (num1>0) countPlus++;
        if (num2<0)
            countMinus++;
        else if (num2>0)countPlus++;
        if (num3<0)
            countMinus++;
        else if (num3>0)countPlus++;

        System.out.println("количество отрицательных чисел: " + countMinus);
        System.out.println("количество положительных чисел: " + countPlus);
    }
}
