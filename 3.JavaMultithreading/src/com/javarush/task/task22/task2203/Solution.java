package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string!=null) {
            String[] s = string.split("\t");
            String s1 = "";
            if (s.length>2){
                s1+=s[1];
            }else throw new TooShortStringException();
            return s1;
        }else throw new TooShortStringException();
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
