package com.star.binaryTree;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class BinaryTree {

    private class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data, Node left,Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    Node root;
    int size;
    BinaryTree()
    {
        Scanner sc=new Scanner(System.in);
        this.root=takeInput(sc,null,false);
    }

    private Node takeInput(Scanner sc, Node parent, boolean isLeftOrRight) {
        if(parent==null)
        {
            System.out.println("Enter the data for root node : ");
        }
        else {
            if(isLeftOrRight)
            {
                System.out.println("Enter the data for left child of "+parent.data);
            }
            else {
                System.out.println("Enter the data for right child of "+parent.data);
            }
        }

        int data=sc.nextInt();
        Node node=new Node(data,null,null);
        this.size++;

        //creating left child
        boolean choice=false;
        System.out.println("do you have left child of "+node.data);
        choice=sc.nextBoolean();
        if(choice)
        {
            node.left=takeInput(sc,node,true);
        }

        //creating right child
        choice=false;
        System.out.println("do you have right child of "+node.data);
        choice=sc.nextBoolean();
        if(choice)
        {
            node.right=takeInput(sc,node,false);
        }

        return  node;
    }

    public void display()
    {
        display(this.root);
    }

    private void display(Node node)
    {
        String str="";
        if(node.left!=null)
        {
            str=str+node.left.data+"=>";
        }
        else {
            str=str+"END=>";
        }
        str=str+node.data;
        if(node.right!=null)
        {
            str=str+"<="+node.right.data;
        }
        else {
            str=str+"<=END";
        }
        System.out.println(str);
        if(node.left!=null)
        {
            this.display(node.left);
        }
        if(node.right!=null)
        {
            this.display(node.right);
        }
    }


    public int height()
    {
        return height(this.root);
    }

    private int height(Node node)
    {
        if(node==null)
            return -1;
        int lheight=this.height(node.left);
        int rheight=this.height(node.right);
        return Math.max(lheight,rheight)+1;
    }

    public void preOrder()
    {
        preOrder(this.root);
    }
    private void preOrder(Node node)
    {
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
