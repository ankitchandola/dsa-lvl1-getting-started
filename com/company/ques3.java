//fiabonacci series

package com.company;

import java.util.*;

public class ques3{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b=1;
        int a=0;
        for(int i=0;i<n;i++){

            int c= a+b;
            System.out.println(a);
            a=b;
            b=c;


        }













    }
}