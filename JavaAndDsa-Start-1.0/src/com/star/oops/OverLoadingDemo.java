package com.star.oops;

 class PolyTest {

    public void print(int a)
    {
        System.out.println("Hello a " + a);
    }

    public void print(int a,int b)
    {
        System.out.println("Hello a "+a+" ,"+b);
    }
}


public class OverLoadingDemo {

    public static void main(String[] args) {
        PolyTest test=new PolyTest();
        test.print(10);
        test.print(20,90);

    }
}
