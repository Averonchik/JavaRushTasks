package com.javarush.task.task24.task2413;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Averon on 6/13/2017.
 */
public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;
    static Arkanoid game;
    private boolean isGameOver;

    public Arkanoid(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void run(){

    }
    public void move(){
        stand.move();
        ball.move();
    }
    public void draw(Canvas canvas){
        ball.draw(canvas);
        stand.draw(canvas);
        for (int i = 0; i < bricks.size(); i++) {
            bricks.get(i).draw(canvas);
        }
    }
    public void checkBricksBump(){
        Iterator<Brick> iterator = bricks.iterator();
        while (iterator.hasNext()){
            if (ball.isIntersec(iterator.next())){
                double angle = Math.random()*360;
                ball.setDirection(angle);
                iterator.remove();
                break;
            }
        }
    }
    public void checkStandBump(){
        if (stand.isIntersec(ball)){
            double angle = 90 + 20*(Math.random()-0.5);
            ball.setDirection(angle);
        }
    }
    public void checkEndGame(){
        if (ball.y>height)
            isGameOver = true;
    }

    public static void main(String[] args) {

    }
}
