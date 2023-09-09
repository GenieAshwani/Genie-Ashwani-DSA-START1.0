package com.star.array;

import java.util.Arrays;

public class SegregateArray {
    public static void main(String[] args) {
        int arr[]={0,1,1,1,0};
        //segrigation(arr);
        seg(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void segrigation(int arr[])
    {
        int c=0;
        for(int value:arr)
        {
            if(value==0) c++;
        }
        for (int i=0;i<c;i++)
        {
            arr[i]=0;
        }
        for (int i=c;i<arr.length;i++)
        {
            arr[i]=1;
        }
    }

    private static void seg(int arr[])
    {
        int i=0,j=arr.length-1;
        //0,1,1,1,0
        while (i<=j)
        {
            if(arr[i]==1)
            {
                if(arr[j]==0)
                {
                    swap(i,j,arr);
                }
                j--;
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
