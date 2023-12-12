package com.example.datastructures.sort;

import java.util.Arrays;

public class InsertionSort {
    /*
    Insertion sort Iterates consuming one input element each repetition, and growing a sorted output list, at each iteration insertion sort removes one element form the input data finds the location it belongs within the sorted list and inserts it there, it repeats until no input element remain.

     Best Case: The best case is when input is an array that is already sorted. In this case insertion sort has a linear running time (i.e., Θ(n)).

    Worst Case: The simplest worst case input is an array sorted in reverse order.
     */
    public static void main(String[] str){
        int[] input = {60,20,40,30,50,10};
        System.out.println("Input = "+ Arrays.toString(input));

        int[] output= new InsertionSort().sort(input);
        System.out.println("Output = "+Arrays.toString(output));
    }

    private int[] sort(int[] input) {
        int n = input.length;
        int key = 0;
        for(int i=1;i<n;i++){
            key = input[i];
            int j = i-1;
            while( j>-1 && input[j]>key){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = key;
        }
        return input;
    }
}
