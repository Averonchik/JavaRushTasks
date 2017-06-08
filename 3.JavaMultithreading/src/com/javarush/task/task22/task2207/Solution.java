package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        while (fileReader.ready()) {
            String[] words = fileReader.readLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                list.add(words[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder(list.get(i));
            stringBuilder.reverse();
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).equals(stringBuilder.toString())) {
                    Pair pair = new Pair();
                    pair.first = list.get(i);
                    pair.second = list.get(j);
                    result.add(pair);
                    list.remove(j);
                }
            }
        }

    }

    public static class Pair {
        String first;
        String second;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
