package com.star.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        moveAllZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveAllZeros(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                swapValues(arr,i,j);
            }
            if(arr[j]!=0) j++;
        }
    }

    private static void swapValues(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
