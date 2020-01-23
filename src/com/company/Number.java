package com.company;

public class Number extends Thread {

    private long threadNumber = -1;

    public long getThreadNumber() {
        return threadNumber;
    }

    @Override
    public void run() {
        threadNumber = genratorNumber();


    }

    private long genratorNumber(){
        return (long)(Math.random()*4000000);
    }

}
