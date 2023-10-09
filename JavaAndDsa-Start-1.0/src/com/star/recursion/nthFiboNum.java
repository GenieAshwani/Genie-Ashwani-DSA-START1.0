package com.star.recursion;

public class nthFiboNum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibo(n));
    }

    static int fibo(int n)
    {
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);

    }

}
