package com.star.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
       int res= removeDupEle(arr);
        System.out.println(res);


    }

    public static int removeDupEle(int arr[])
    {
        int i=0,j=0;
        while(j<arr.length)
        {
            if(arr[j]==arr[i])
            {
                j++;
            }
            else if (arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i+1;
    }
}
