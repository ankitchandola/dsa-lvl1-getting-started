//print digits of a number

package com.company;

import java.util.*;

public class ques5 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nd = 0;
        int temp = n;
        while(temp != 0){
            temp=temp/10;
            nd++;
        }
        int div;

        div = (int)Math.pow(10, nd-1);

        while(div !=0 ){
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;

        }


    }
}