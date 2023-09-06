package com.star.array;

public class SumOfArray {

    public static void main(String[] args) {

        int arr[]={10,20,11,12,13,14};

        //sum using for loop
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
