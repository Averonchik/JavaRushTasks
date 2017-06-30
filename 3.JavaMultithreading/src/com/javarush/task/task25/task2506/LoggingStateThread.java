package com.javarush.task.task25.task2506;

/**
 * Created by Averon on 6/30/2017.
 */
public class LoggingStateThread extends Thread {
    private Thread t;
    private State state = null;

    public LoggingStateThread(Thread target) {
        this.t = target;
        state = t.getState();
    }

    @Override
    public void run() {
        System.out.println(state);
        while (state!=State.TERMINATED){
            State currentState = t.getState();
            if (state!=currentState){
                state=currentState;
                System.out.println(state);
            }
        }
    }
}
