package com.company;

public class Number extends Thread {

    private long threadNumber  ;

    public long getThreadNumber() {
        return threadNumber;
    }

    @Override
    public void run() {

        try {
            threadNumber = genratorNumber();
            wait(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private long genratorNumber(){
        return (long)(Math.random()*2);
    }

}
