package com.star.MyInterface;

interface TeraInterface{
    void print();
}
 interface MyInterface {

     int MAX_VALUE = 100;

    void hello1(); // Abstract method
    int hello2(); // Abstract method


     //java 1.8
     default void m2()
     {
         System.out.println("Kaise ho sab...");
     }

}
 class DemoAbs implements MyInterface,TeraInterface
{

    @Override
    public void hello1() {
        System.out.println("Ram");
    }

    @Override
    public int hello2() {
        System.out.println("Sita");
        return 0;
    }

    public void m2()
    {
        System.out.println("Hi Child class...");
    }

    @Override
    public void print() {

    }
}

public class MyClass{
    public static void main(String[] args) {
        DemoAbs demoAbs=new DemoAbs();
        System.out.println(demoAbs.MAX_VALUE);
        System.out.println(MyInterface.MAX_VALUE);  //MAX_VALUE static
        demoAbs.hello1();
        demoAbs.m2();


       // MyInterface myInterface=new MyInterface();
    }
}
