//print digits of a number in reverse

package com.company;

import java.util.*;

public class ques4{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int d;
        while(n!=0){

            d=n%10;
            n=n/10;

            System.out.println(d);

        }


    }
}