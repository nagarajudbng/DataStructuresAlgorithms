package com.example.datastructures.codetest;


import java.util.Arrays;

class AddTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        // int[] nums = {2,7,11,15};
        int indexA = 0,indexB = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    indexA = i;
                    indexB = j;
                    break;
                }
            }
        }
        int[] a = {indexA,indexB};

        return a;
    }
    public static void main(String[] str){
        int[] a={2,7,11,15};
        int[] result = new AddTwoNumbers().twoSum(a,9);
        System.out.println(Arrays.toString(result));
    }
}