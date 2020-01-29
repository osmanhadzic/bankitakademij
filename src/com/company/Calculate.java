package com.company;

public class Calculate {

    public static void main(String[] args) throws InterruptedException {



        long sum = 0;



           for (int i = 0; i < 10; i++) {
               Number num = new Number();
               num.start();
               Thread.sleep(30);
               sum += num.getThreadNumber();
               System.out.println(num.getThreadNumber() + " " + num.getId());
//               num.notify();
           }

            System.out.println(sum);

        }


}
