package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Averon on 17.02.2017.
 */
public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();

    public Hippodrome(List list) {
        horses = list;
    }

    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        game = new Hippodrome(list);
        Horse h1 = new Horse("Siva", 3, 0);
        Horse h2 = new Horse("Slava", 3, 0);
        Horse h3 = new Horse("Light", 3, 0);
        list.add(h1);
        list.add(h2);
        list.add(h3);
        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }
    static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    public void print(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner(){
        Horse win = horses.get(0);
        for (int i = 0; i < horses.size(); i++) {
            if (win.getDistance()<(horses.get(i).getDistance()))
                win = horses.get(i);
        }

        return win;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
