package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num<10&&num>0)
            if (num%2==0)
                System.out.println("четное однозначное число");
            else System.out.println("нечетное однозначное число");
        else if (num>9&&num<100)
            if (num%2==0)
                System.out.println("четное двузначное число");
            else System.out.println("нечетное двузначное число");
        else if (num>99&&num<1000)
            if (num%2==0)
                System.out.println("четное трехзначное число");
            else System.out.println("нечетное трехзначное число");
    }
}
