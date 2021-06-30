//1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//       2. Take as input n and k.
//       3. Print the rotated number.
//      4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//      n = 12340056
//     k = 3
//     r = 05612340


package com.company;

import java.util.*;

public class ques6 {

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();
        int f = n;
        int nod = 0;
        while (n != 0) {
            n = n / 10;
            nod++;
        }
        k = k % nod;
        if (k < 0)
            k = k + nod;

         nod = nod - k;
        int divider = (int) Math.pow(10, k);
        int value = f % divider;
        int temp = f / divider;
        int newvalue = (int) Math.pow(10, nod);
        int finalvalue = newvalue * value;
        int answer = finalvalue + temp;
        System.out.println(answer);
    }
}