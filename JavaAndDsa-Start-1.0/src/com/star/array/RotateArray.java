package com.star.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        reverse(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[],int d)
    {
        for(int i=0;i<d;i++)
        {
            swap(arr,0);
        }
    }
    public static void swap(int arr[],int index)
    {
        int temp=arr[index];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }

}
