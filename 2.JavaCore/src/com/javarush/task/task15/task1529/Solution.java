package com.javarush.task.task15.task1529;

import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        if (read.equals("helicopter"))
            result = new Helicopter();
        else if (read.equals("plane")) {
            int i = scanner.nextInt();
            result = new Plane(i);
        }
        scanner.close();
    }
}
