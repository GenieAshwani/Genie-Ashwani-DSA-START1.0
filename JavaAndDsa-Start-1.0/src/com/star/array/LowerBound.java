package com.star.array;

public class LowerBound {

    public static void main(String[] args) {
        int arr[]={3,3,3,3,4};
        System.out.println(findLowerBound(arr));
        System.out.println(findUperBound(arr));

    }
    public static int findLowerBound(int arr[])
    {
        ///found index
        //not found -1
        int low=0;
        int hi=arr.length-1;
        int res=-1;
        while(low<=hi)
        {
            int mid=(low+hi)/2;
            if(arr[mid]==3)
            {
                res=mid;
                hi=mid-1;
            } else if (arr[mid]>3) {
                hi=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return res;
    }
    public static int findUperBound(int arr[])
    {
        ///found index
        //not found -1
        int low=0;
        int hi=arr.length-1;
        int res=-1;
        while(low<=hi)
        {
            int mid=(low+hi)/2;
            if(arr[mid]==3)
            {
                res=mid;
                low=mid+1;
            } else if (arr[mid]>3) {
                hi=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return res;
    }
}
