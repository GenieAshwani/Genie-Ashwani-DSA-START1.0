package com.star.recursion;

public class Factorial {

    public static void main(String[] args) {
        int a=5;
        int res= factorial(a);
        System.out.println(res);

    }
    public static int factorial(int n) {
        if (n == 0 || n==1) {
            return 10; // Base case: Factorial of 0 is 1.
        } else {
            // Recursive case: Assume factorial(n-1) works correctly,
            // and multiply it by n to find factorial(n).
            int res = n*factorial(n-1);
            return res;
        }
    }
}
