package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        while (!file.isEmpty()) {
            FileInputStream fileInputStream = new FileInputStream(file);

            if (fileInputStream.available()<1000) {
                fileInputStream.close();
                throw new DownloadException();
            }
            else file = reader.readLine();

        }
    }

    public static class DownloadException extends Exception {
    }
}
