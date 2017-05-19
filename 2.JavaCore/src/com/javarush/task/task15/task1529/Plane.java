package com.javarush.task.task15.task1529;

/**
 * Created by Averon on 18.04.2017.
 */
public class Plane implements Flyable {

    @Override
    public void fly() {

    }
    private int numPass;
    public Plane(int numPass) {
        this.numPass = numPass;
    }
}
