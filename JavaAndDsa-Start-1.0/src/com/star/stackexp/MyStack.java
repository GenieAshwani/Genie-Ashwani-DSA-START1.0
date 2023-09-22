package com.star.stackexp;

class StackExp {

    public void m1()
    {
        System.out.println("m1....");
        m2();
    }

    public void m2()
    {
        System.out.println("m1....");
        m3();
    }
    public void m3()
    {
        System.out.println("m1....");
        m4();
    }
    public void m4()
    {
        System.out.println("m1....");
        m5();
    }  public void m5()
    {
        System.out.println("m1....");
    }


}

public class MyStack {
    public static void main(String[] args) {
        StackExp stackExp=new StackExp();
        stackExp.m1();
    }
}
