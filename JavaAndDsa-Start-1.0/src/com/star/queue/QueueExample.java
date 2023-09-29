package com.star.queue;

import java.util.Scanner;

class MyQueue{

    int front;
    int rear;
    int maxSize;
    int currentSize;
    int []queue;

    //constructor
    MyQueue(int size)
    {
        maxSize=size;
        queue=new int[size];
        front=0;
        rear=-1;
        currentSize=0;

    }


    public boolean isFull()
    {
        return currentSize==maxSize;
    }

    public int size()
    {
        return currentSize;
    }
    public boolean isEmpty()
    {
        return currentSize==0;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full, Cannot enqueue");
            return;
        }
        rear++;
        queue[rear]=data;
        System.out.println(data+" Data Added to the queue");
        currentSize++;
    }

    public int dequeue(){
        if (isEmpty())
        {
            System.out.println("Queue is empty. cannot dequeue");
            front=0;
            rear=-1;
            return -1;
        }
        int data=queue[front];
        System.out.println(data+" Data removed from queue");
        front++;
        currentSize--;
        return data;
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. cannot peek");
            return -1;
        }
        return queue[front];
    }
}
public class QueueExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of queue : ");
        int size =sc.nextInt();
        MyQueue queue=new MyQueue(size);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);

        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
