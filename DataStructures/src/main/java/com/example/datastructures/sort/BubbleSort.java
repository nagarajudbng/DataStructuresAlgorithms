package com.example.datastructures.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] str){
        int[] input = {60,20,40,30,50,10};
        System.out.println("Input = "+Arrays.toString(input));

        int[] output = new BubbleSort().bubbleSort(input);
        System.out.println("Output = "+Arrays.toString(output));
    }
    public int[] bubbleSort(int[] a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int x = a[j];
                    a[j] =a[j+1];
                    a[j+1] = x;
                }
            }
        }
        return a;
    }

}
