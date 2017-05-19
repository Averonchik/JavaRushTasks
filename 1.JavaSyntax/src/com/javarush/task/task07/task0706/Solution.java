package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] house = new int[15];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < 15; i++) {
            house[i] = Integer.parseInt(reader.readLine());
            if (i==0||i%2==0)
                even = even + house[i];
            else odd = odd + house[i];
        }

        if (odd>even)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
