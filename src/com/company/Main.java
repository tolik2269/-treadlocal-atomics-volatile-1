package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user= new User();
        Box box =new Box();

        User userThread=new User();
        Box gameThread=new Box();
        userThread.start();
        gameThread.start();

        userThread.join();
        System.out.println(userThread.isAlive());
        gameThread.setStopped(true);
    }
}
