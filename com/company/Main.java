// check if a number is prime or not

package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            int f=0;
            int n = scn.nextInt();

            for (int div = 2; div*div <= n; div++) {
                if (n % div == 0) {
                    f++;

                }

            }
            if (f == 0 ) {
                System.out.println("prime");

            }
            else {
                System.out.println("not prime");
            }

        }



    }
}