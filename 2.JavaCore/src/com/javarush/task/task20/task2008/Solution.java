package com.javarush.task.task20.task2008;

import java.io.Serializable;

/* 
Как сериализовать Singleton?
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException {

    }

    public static class Singleton implements Serializable {
        private static Singleton ourInstance;

        public static Singleton getInstance() {
            if (ourInstance == null) {
                ourInstance = new Singleton();
            }
            return ourInstance;
        }
        private Object readResolve(){
            return getInstance();
        }

        private Singleton() {
        }
    }
}
