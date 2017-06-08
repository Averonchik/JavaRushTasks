package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry pair : params.entrySet()){
            if (pair.getValue()!=(null)) {
                if (stringBuilder.toString().equals(""))
                    stringBuilder.append(String.format("%s = '%s'", pair.getKey(), pair.getValue()));
                else stringBuilder.append(String.format(" and %s = '%s'", pair.getKey(), pair.getValue()));
            }
        }
        return stringBuilder.toString();
    }
}
