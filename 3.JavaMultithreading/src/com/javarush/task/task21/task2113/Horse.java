package com.javarush.task.task21.task2113;

/**
 * Created by Averon on 17.02.2017.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;
    public Horse(String name, double speed, double distance){
        setName(name);
        setSpeed(speed);
        setDistance(distance);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSpeed(){
        return this.speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getDistance(){
        return this.distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void move(){
        distance+= speed*Math.random();
    }
    public void print(){
        int a = (int) Math.floor(distance);
        for (int i = 0; i < a; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }
}
