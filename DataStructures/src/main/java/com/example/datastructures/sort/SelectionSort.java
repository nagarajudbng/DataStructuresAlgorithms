package com.example.datastructures.sort;

import java.util.Arrays;

public class SelectionSort {
    /*
    The algorithm sorts an array by repeatedly finding the minimum element (considering ascending
     order) from the unsorted part and putting it at a proper position in the array.
     */
    public static void main(String[] str){
        int[] input = {60,20,40,30,50,10};
        System.out.println("Input = "+ Arrays.toString(input));

        int[] output= new SelectionSort().selectionSort(input);
        System.out.println("Output = "+Arrays.toString(output));
    }

    private int[] selectionSort(int[] input) {
        int n= input.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(input[j]<input[min]){
                    min = j;
                }
            }
            if(min!=i) {
                int x = input[i];
                input[i] = input[min];
                input[min] = x;
            }
        }
        return input;
    }

}
