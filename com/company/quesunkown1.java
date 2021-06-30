package com.company;

import java.util.*;

public class quesunkown1 {

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int low;
        int high;
        if(a<b) {
            low = a;
            high = b;
        }
        else{
            low=b;
            high=a;
        }


        for(int i = low; i>1 ; i--){
            if(low%i==0 && high%i==0){
                System.out.println(i);
                System.out.println(a*b/i);
                break;
            }
        }


    }
}