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
        String fileName = reader.readLine();

        while (!fileName.equals("")) {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            if (fileInputStream.available()>=1000) {
                fileInputStream.close();
                fileName = reader.readLine();
            } else {
                fileInputStream.close();
                reader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
