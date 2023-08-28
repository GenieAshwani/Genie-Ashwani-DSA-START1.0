package com.star.oops;

class Dhani{

    //parent class
    //papa
    int a=10;
    public void house()
    {
        System.out.println("Normal House");
    }
}

class DhaniKaBeta extends Dhani
{
    //child class
    public void house()
    {
        System.out.println("Modifide House");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {

        Dhani dhani=new Dhani();
        dhani.house();


        DhaniKaBeta beta = new DhaniKaBeta();
        beta.house();
        System.out.println(beta.a);

    }
}
