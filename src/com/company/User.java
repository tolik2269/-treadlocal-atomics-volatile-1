package com.company;

public class User extends Thread{

    private static final int DEFAULT_SLEEP_TIME = 500;
    private static final int ITERATION_COUNT = 10;

    private Tumbler tumbler;

    public User(Tumbler tumbler){
        this.tumbler=tumbler;
    }

    @Override
    public void run()  {
        for (int k = 0; k < ITERATION_COUNT; k++) {
            if (!tumbler.getTumbler()) {
                System.out.println("User has activated tumbler (" + k + ")");
                tumbler.setTumbler(true);
                try {
                    Thread.sleep(DEFAULT_SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
