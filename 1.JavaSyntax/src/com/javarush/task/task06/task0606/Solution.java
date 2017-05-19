package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        ArrayList<Integer> nums = new ArrayList<>();

        while (num > 0) {
            nums.add(0,num % 10);
            num = num / 10;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%2==0)
                even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
