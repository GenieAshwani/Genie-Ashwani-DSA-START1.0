package com.star.array;

import java.util.Scanner;

public class ArrayProg3 {
    public static void main(String[] args) {

        //int arr[]=new int[]; //size
        //take array length
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length for array");
        int n= sc.nextInt();  // user enter

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the data for index = "+i);
            int data = sc.nextInt();
            arr[i]=data;
        }

        System.out.println("Enter the value to search in the array");
        int item = sc.nextInt();

        for(int i=0;i< arr.length;i++)
        {
            if (arr[i]==item)
            {
                System.out.println("Item found in array..");
                break;
            }
            else {
                System.out.println("Item not found..");
            }
        }


    }
}
