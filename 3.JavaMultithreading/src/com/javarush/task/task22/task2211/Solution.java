package com.javarush.task.task22.task2211;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/*
Смена кодировки
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        FileInputStream fileReader = new FileInputStream(args[0]);
        FileOutputStream fileWriter = new FileOutputStream(args[1]);
        byte[] bytes = new byte[fileReader.available()];
        fileReader.read(bytes);
        String s = new String(bytes, Charset.forName("UTF-8"));
        bytes = s.getBytes(Charset.forName("Windows-1251"));
        fileWriter.write(bytes);
    }
}
