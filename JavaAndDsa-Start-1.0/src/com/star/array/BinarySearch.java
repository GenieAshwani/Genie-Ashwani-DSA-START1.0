package com.star.array;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[]={50,60,70,80,90,100,110,120,150,200,250,300};

        int res = binarySearch(arr);
        System.out.println(res);


    }

    public static int binarySearch(int arr[])
    {
        int lo=0;
        int hi=arr.length-1;
        int data=60;

        while (lo<=hi)
        {
            int mid =(lo+hi)/2;
            if(arr[mid]<data)
            {
                lo=mid+1;
            }
            else if(arr[mid]>data)
            {
                hi=mid-1;
            }
            else
            {
                return mid;
            }

        }
        return -1;
    }
}
