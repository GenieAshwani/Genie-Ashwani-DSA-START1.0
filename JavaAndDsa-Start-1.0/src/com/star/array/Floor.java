package com.star.array;

public class Floor {
    public static void main(String[] args) {
        int arr[]={1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,13));
    }

    public static int findFloor(int arr[],int x)
    {
        int l=0;
        int hi=arr.length-1;
        int mid=0;
        int res=-1;
        while (l<=hi)
        {
            mid=(l+hi)/2;
            if(arr[mid]>x)
            {
                hi=mid-1;
            }
            else if(arr[mid]<x)
            {
                res=mid;
                l=mid+1;
            }
        }
        return res;
    }
}
