package com.star.linkedlist;

public class MyLinkedList {

    //Node structure
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next=null;
        }
    }

    Node head;

    public void insertNode(int data){
        //creating new node
        Node newNode =new Node(data);
        if(this.head==null)
        {
            this.head=newNode;
        }
        else {

            Node temp = this.head;
            while (temp.next!= null){
                temp=temp.next;
            }

            temp.next=newNode;
            newNode.next=null;
        }
    }

    public void printLinkedList()
    {
        Node temp=this.head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.insertNode(10);
        myLinkedList.insertNode(11);
        myLinkedList.insertNode(20);
        myLinkedList.insertNode(30);
        myLinkedList.insertNode(40);

        myLinkedList.printLinkedList();

    }
}
