package Array;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        //create a array
        int arr[]=new int[500];
        /*int []arr1 = new int[5];
        int[] arr3 = new int[5];
        int arr4[]={1,2,3,4,5};*/

        //storing value in array
        /*arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //fetching value from array
        System.out.println(arr[2]);*/


        Scanner sc=new Scanner(System.in);
        System.out.println("************Storing value***************");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the value for index = "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("************Fetching value***************");
        for(int i=0;i<5;i++)
        {
            System.out.println("value for index "+i+" = "+arr[i]);

        }

        System.out.println(arr);
    }
}
