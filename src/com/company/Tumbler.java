package com.company;

public class Tumbler {
    volatile boolean tumbler;

//    public Tumbler (boolean tumbler){
//        this.tumbler=tumbler;
//    }

public Tumbler() {

   }

    public  boolean getTumbler(){
        return tumbler;
    }

    public void setTumbler(boolean tumbler) {
        this.tumbler = tumbler;
    }


}
