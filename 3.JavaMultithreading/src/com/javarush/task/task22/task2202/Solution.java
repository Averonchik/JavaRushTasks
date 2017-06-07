package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string!=null) {
            String[] s = string.split(" ");
            String s1 = "";
            if (s.length > 4) {
                for (int i = 1; i < 5; i++) {
                    s1 += s[i] + " ";
                }
            } else throw new TooShortStringException();
            return s1.trim();
        }else throw new TooShortStringException();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
