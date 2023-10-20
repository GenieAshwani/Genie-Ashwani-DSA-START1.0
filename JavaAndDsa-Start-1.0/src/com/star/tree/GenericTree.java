package com.star.tree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data)
        {
            this.data=data;
            this.children=new ArrayList<>();
        }
    }

    private Node root;
    int size;

    GenericTree()
    {
        Scanner sc=new Scanner(System.in);
        this.root=createGenericTree(sc,null,0);
    }

    private Node createGenericTree(Scanner sc, Node parent, int ithChild) {

        if(parent==null)
        {
            System.out.println("Enter the data for root node : ");
        }
        else {
            System.out.println("Enter the data for the "+ithChild+" ith child of "+parent.data);
        }

        int data=sc.nextInt();
        Node node=new Node(data);

        System.out.println("Enter the number of childs for "+node.data);
        int children=sc.nextInt();

        for(int i=0;i<children;i++){
            Node child=this.createGenericTree(sc,node,i);
            node.children.add(child);
        }
        return node;
    }

    public void display()
    {
        display(this.root);
    }
    private void display(Node node)
    {

        String res=node.data+" -> ";
        for(int i=0;i<node.children.size();i++)
        {
            res=res+node.children.get(i).data+", ";
        }
        res=res+"END";
        System.out.println(res);
        for(int i=0;i<node.children.size();i++)
        {
            this.display(node.children.get(i));
        }


    }

}
