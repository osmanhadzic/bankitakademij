package com.company;

public class Calculate {

    public static void main(String[] args)  {

        Number num = new Number();

        long sum = 0;

           for (int i = 0; i < 100000; i++) {
               sum += num.getThreadNumber();
                System.out.println(num.getThreadNumber());
               num.run();
           }

            System.out.println(sum);

        }


}
