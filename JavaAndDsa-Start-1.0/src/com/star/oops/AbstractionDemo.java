package com.star.oops;


abstract class AbstractionTest
{
    abstract int sum();
    public void print()
    {
        System.out.printf("Jai Shree Ram...");
    }
}

class Test extends AbstractionTest
{

    @Override
    int sum() {
        System.out.printf("Hello Sum");
        return 10;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Test t=new Test();
        int res=t.sum();
        System.out.println(res);
    }
}
