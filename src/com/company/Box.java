package com.company;

public class Box extends Thread {

    private boolean stopped = false;

    private Tumbler tumbler;

    public Box (Tumbler tumbler){
        this.tumbler=tumbler;
    }
    @Override
    public void run () {
        while (true) {
            if (!stopped) {
                while (tumbler.getTumbler()) {
                    System.out.println("Game thread disable tumbler");
                    tumbler.setTumbler(false);
                }
            }
        }
    }

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }
}
