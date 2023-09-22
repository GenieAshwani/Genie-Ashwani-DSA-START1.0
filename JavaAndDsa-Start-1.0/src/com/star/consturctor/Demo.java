package com.star.consturctor;


class TestCons{

    int data;

    //static block
    {
        System.out.println("Main Static Block");
    }
    //no return type
    TestCons()
    {
        //default
        System.out.println("Main hu constructor");
    }
    TestCons(int data)
    {
        this.data=data;
        System.out.println("Main hu constructor with Para");
    }
}


class TestConsChild extends TestCons{
    TestConsChild()
    {
        System.out.println("Main Hu Child Cons..");
    }
}

public class Demo {
    public static void main(String[] args) {

/*        TestCons testCons=new TestCons();  /// default constuctor
        TestCons testCons1=new TestCons();  /// default constuctor
        TestCons testCons2=new TestCons();  /// default constuctor*/



        TestConsChild testConsChild=new TestConsChild();
    }
}
