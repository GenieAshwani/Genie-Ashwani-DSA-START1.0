package com.star.array;

public class LowerBound {

    public static void main(String[] args) {
        int arr[]={3,3,3,3,4};
        System.out.println(findLowerBound(arr));
        System.out.println(findUperBound(arr));
        findFirstAndLast(arr,3);

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


    public static void findFirstAndLast(int arr[], int x)
    {
        int n = arr.length;
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "
                    + first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");
    }

}
