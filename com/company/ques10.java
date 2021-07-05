package com.company;

import java.util.*;

public class ques10 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int dividend = n1;
        int divisor = n2;

        int rem = 5;
        while (dividend % divisor != 0) {
            rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;

        }
        int gcd = divisor;
        int lcm = (n1 * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
    }
