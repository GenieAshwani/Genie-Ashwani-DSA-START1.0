package com.star.array;

public class SecondMax {

    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int seconMax = seconMax(arr);
        System.out.println(seconMax);

    }

    public static int seconMax(int arr[])
    {
       int max=Integer.MIN_VALUE; //arr[0]
       int secMax=Integer.MIN_VALUE; //-1
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>max)
           {
               secMax=max;
               max=arr[i];
           }
           else if(arr[i]<max && arr[i]>secMax)
           {
               secMax=arr[i];
           }
       }
       return secMax;
    }

}
