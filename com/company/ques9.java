
//1. You are given n number of bulbs. They are all switched off.
//        A weird fluctuation in voltage hits the circuit n times.
//        In the 1st fluctuation all bulbs are toggled,
//        in the 2nd fluctuation every 2nd bulb is toggled,
//        in the 3rd fluctuation every 3rd bulb is toggled and so on.
//        You've to find which bulbs will be switched on after n fluctuations.
//2. Take as input a number n, representing the number of bulbs.
//3. Print all the bulbs that will be on after the nth fluctuation in voltage.




package com.company;

import java.util.*;

public class ques9 {


    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();


        int i = 1;

        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }


    }
}
