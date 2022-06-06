package com.company;

public class User extends Thread{

    private static final int DEFAULT_SLEEP_TIME = 500;
    private static final int ITERATION_COUNT = 10;

    @Override
    public void run()  {
        for (int k = 0; k < ITERATION_COUNT; k++) {
            Tumbler.tumbleruserbox = true;
            System.out.println("User has activated tumbler (" + k + ")");
            try {
                Thread.sleep(DEFAULT_SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
