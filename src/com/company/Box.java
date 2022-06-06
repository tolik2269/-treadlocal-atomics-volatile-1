package com.company;

public class Box extends Thread{

    private boolean stopped = false;

    @Override
    public void run () {
        while (true) {
            if (!stopped) {
                while (Tumbler.tumbleruserbox) {
                    Tumbler.tumbleruserbox = false;
                    System.out.println("Game thread disable tumbler");
                }
            }
        }
    }

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }
}
