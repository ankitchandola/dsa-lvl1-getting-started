// inverse of a number

package com.company;

import java.util.*;

public class ques7 {
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 0;
        int p = 1;
        //12345
        while(n>0){
            int digit = n%10;
            n=n/10;
            i= i + p*(int) Math.pow(10, digit-1);
            p++;



        }
        System.out.println(i);






    }

}
