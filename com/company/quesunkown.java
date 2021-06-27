package com.company;
import java.util.*;

public class quesunkown {

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        int f = n;
        int nod=0;
        while(n!=0){
            n=n/10;
            nod++;
        }
        if(k>0) {
            int nod2 = nod - k;
            int divider = (int) Math.pow(10, k);
            int value = f % divider;
            int temp = f / divider;
            int newvalue = (int) Math.pow(10, nod2);
            int finalvalue = newvalue * value;
            int anwser = finalvalue + temp;
            System.out.println(anwser);
        }
        else {
            int nod2 = nod - Math.abs(k);
            int divider2 = (int) Math.pow(10, Math.abs(k-1));
            int divider = (int) Math.pow(10, Math.abs(k-1));
            int value = f % divider;
            int temp = f / divider2;
            int newvalue = (int) Math.pow(10, nod2-1);
            int finalvalue = newvalue * value;
            int answer = finalvalue + temp;
            System.out.println(answer);
        }


    }
}
