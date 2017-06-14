package com.javarush.task.task24.task2413;

/**
 * Created by Averon on 6/13/2017.
 */
public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

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
        double angel = Math.toRadians(direction);
        dx = Math.cos(angel)*speed;
        dy = -Math.sin(angel)*speed;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        isFrozen = true;
    }

    @Override
    public void move() {
        if (!isFrozen){
            x+=dx;
            y+=dy;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x,y, 'O');
    }
    public void start(){
        this.setDirection(direction);
        isFrozen = false;
    }
    public void checkRebound(int minx, int maxx, int miny, int maxy){

    }
}
