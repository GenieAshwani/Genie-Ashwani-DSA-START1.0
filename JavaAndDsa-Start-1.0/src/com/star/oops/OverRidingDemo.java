package com.star.oops;

class OverRriding{

     protected void printRam()
    {
        System.out.println("Ram ");
    }
}

class OverridingTest extends OverRriding
{
    protected void printRam()
    {
        System.out.println("Jai Siya Ram");
    }

}

public class OverRidingDemo {

    public static void main(String[] args) {

        OverRriding overRriding=new OverRriding();
        overRriding.printRam(); //parent
        OverridingTest overridingTest=new OverridingTest();
        overridingTest.printRam(); // child


        OverRriding test=new OverridingTest();
        test.printRam(); //parent

    }
}
