package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream stream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        testString.printSomething();

        String result = outputStream.toString();
        String[] strs = result.split(" ");
        int c = 0;
        if (strs[1].equals("+"))
            c = Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]);
        else if (strs[1].equals("-"))
            c = Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]);
        else if (strs[1].equals("*"))
            c = Integer.parseInt(strs[0]) * Integer.parseInt(strs[2]);

        System.setOut(stream);

        System.out.println(strs[0] + " " + strs[1] + " " + strs[2] + " " + strs[3] + " " + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

