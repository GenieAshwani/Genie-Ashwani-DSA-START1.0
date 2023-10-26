package com.star.binaryTree;

public class Driver {
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.displayBinaryTree();
        System.out.println("Pre-Order");
        binaryTree.preOrder();
        System.out.println();
        System.out.println("In-Order");
        binaryTree.inOrder();
        System.out.println();
        System.out.println("Post-Order");
        binaryTree.postOrder();

        //100 true 50 true 20 false false true 30 false false true 60 true 11 false false true 12 false false
    }
}
