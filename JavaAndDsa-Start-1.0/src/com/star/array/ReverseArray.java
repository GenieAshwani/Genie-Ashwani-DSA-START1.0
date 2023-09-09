package com.star.array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[]={10,20,11,12,13,14};
        //14,13,12,11,20,10
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

       /* for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }*/
    }

    //two pointer approach
    public static void reverseArray(int arr[])
    {
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            swap(i,j,arr);
            i++;
            j--;
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
