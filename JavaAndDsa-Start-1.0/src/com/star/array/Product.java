package com.star.array;

import java.util.Arrays;

public class Product {

    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        int res[]=new int[arr.length];
        System.out.println(Arrays.toString(arr));
        productOfElement(arr,res);
        System.out.println(Arrays.toString(res));
        coninueTest();

    }

    public static void productOfElement(int arr[],int res[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int sum=1;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                sum=sum*arr[j];
            }
            res[i]=sum;
        }
    }

    public static void coninueTest()
    {
        for (int i=0;i<10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println("Radhe Radhe "+i);
        }

    }
}
