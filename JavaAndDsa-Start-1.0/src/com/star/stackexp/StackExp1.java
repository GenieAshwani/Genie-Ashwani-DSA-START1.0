package com.star.stackexp;


import java.util.Scanner;

class MyNewStack{

    int arr[];
    int top;
    MyNewStack(int len)
    {
        this.arr=new int[len];
        this.top=-1;
    }

    //size of stack
    public int size(){
        return top+1;
    }

    //push element into the stack
    public void push(int data)
    {
        if(size()==arr.length)
        {
            System.out.println("Stack is full...");
        }
        top++;
        arr[top]=data;
    }

    public int pop()
    {
        if(size()==0)
        {
            System.out.println("Stack is empty...");
        }
        int data=arr[top];
        arr[top]=0;
        top--;
        return data;
    }

    public int top()
    {
        if(size()==0)
        {
            System.out.println("Stack is empty...");
        }
        return arr[top];
    }

    public void display()
    {
        if(size()==0)
        {
            System.out.println("Stack is empty...");
        }
        for (int data:arr)
        {
            System.out.print(data+",");
        }
    }
}
public class StackExp1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of stack : ");
        int len =sc.nextInt();
        MyNewStack myNewStack=new MyNewStack(len);
        myNewStack.push(10);
        myNewStack.push(20);
        myNewStack.push(30);
        myNewStack.push(40);
        myNewStack.push(50);
        myNewStack.display();
        System.out.println();
        System.out.println("stack size : "+myNewStack.size());
        System.out.println("stack top element : "+myNewStack.top());
        System.out.println("stack pop element : "+myNewStack.pop());
        myNewStack.display();
        System.out.println();
        System.out.println("stack size : "+myNewStack.size());
    }
}
