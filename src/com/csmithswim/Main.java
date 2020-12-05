package com.csmithswim;

import java.util.Scanner;

public class Main {

    public static int factorial(int n){


        // factorial = n * (n -1)...
        n=n*factorial(n);

        if (n <= 0) {

            return n;

        }
        return factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(factorial(input));
    }
}
