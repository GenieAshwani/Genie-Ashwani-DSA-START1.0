package com.star.recursion;

public class CheckArraySorted {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,2};
        System.out.println(checkArray(arr,0));
    }

    public static boolean checkArray(int arr[],int i)
    {
        //base condition
        if(i==arr.length-1)
        {
            return true;
        }

        //work
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        //call
       return checkArray(arr,i+1);
    }
}
