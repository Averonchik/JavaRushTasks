package com.javarush.task.task24.task2413;

/**
 * Created by Averon on 6/13/2017.
 */
public class Stand extends BaseObject {
    private double speed;
    private double direction;
    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public void move() {
        x+=speed*direction;
    }

    @Override
    public void draw(Canvas canvas) {

    }
    public void moveLeft(){
        direction=-1;
    }
    public void moveRight(){
        direction=1;
    }
}
