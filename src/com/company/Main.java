package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Tumbler tumbler=new Tumbler();

        User user= new User(tumbler);
        Box box =new Box(tumbler);

        User userThread=new User(tumbler);
        Box gameThread=new Box(tumbler);
        userThread.start();
        gameThread.start();

        userThread.join();
        System.out.println(userThread.isAlive());
        gameThread.setStopped(true);
    }
}
