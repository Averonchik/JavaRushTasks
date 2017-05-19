package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("100",100);
        map.put("200",200);
        map.put("300",300);
        map.put("400",400);
        map.put("500",500);
        map.put("600",600);
        map.put("700",700);
        map.put("800",800);
        map.put("900",900);
        map.put("1000",1000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int)pair.getValue()<500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}