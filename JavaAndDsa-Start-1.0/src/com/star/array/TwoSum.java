package com.star.array;

public class TwoSum {

    public static void main(String[] args) {

        int arr[]={11,15,2,7};
        int data =9;

        twoSum(arr,data);

    }
    public  static int[] twoSum(int[] nums, int target) {

        int res[]=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;
                }

            }
        }
        return res;

    }
}
