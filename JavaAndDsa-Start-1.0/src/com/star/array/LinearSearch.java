package com.star.array;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[]={10,11,3,4,5,6,7,88};
        int data =7;

        //linear search
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                System.out.println("element found in array");
                break;
            }
        }
    }
}
