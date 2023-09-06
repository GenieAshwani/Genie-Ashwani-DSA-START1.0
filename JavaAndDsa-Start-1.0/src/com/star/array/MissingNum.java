package com.star.array;

public class MissingNum {

    public static void main(String[] args) {

        int arr[]={0,4,1,3};
        int number = number(arr);
        System.out.println(number);

    }

    public static int number(int arr[])
    {
        int n=arr.length;
        int sum=(n*(n+1)/2);
        System.out.println("Actual= "+sum);
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i];
        }
        System.out.println("Array sum= "+res);
        return sum-res;
    }

}
