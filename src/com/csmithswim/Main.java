package com.csmithswim;


import java.util.Scanner;


public class Main {

    //Notes to consider: The end condition is when the recursive call stops calling itself and it should be a conditional that is an ==.
    // Also known as a base case
    public static int factorial(int n){
        if (n == 1) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(factorial(input));
    }
}
