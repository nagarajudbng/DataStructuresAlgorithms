package com.example.datastructures.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] arg){
        int[] input = {80,70,20,10,0,90,60};
        System.out.println("Input = "+ Arrays.toString(input));

        int[] output = new QuickSort().quickSort(input,0,input.length-1);
        System.out.println("Output = "+Arrays.toString(output));
    }

    private int[] quickSort(int[] input, int low, int high) {
        int a[] = input;

        if(low<high){
            int pi = partition(a,low,high);
//            System.out.println("pi="+pi);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }

        return a;
    }

    private int partition(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low-1;
//        System.out.println("i= "+i);
        for(int j=low;j<high;j++){
//            System.out.println("for j= "+j);
            if(input[j] <= pivot){
//                System.out.println("if j= "+j);
                i++;
//                System.out.println("for i= "+i);
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
        }
        int temp = input[i+1];
        input[i+1] = input[high];
        input[high] = temp;
//        System.out.println("partition i= "+i+", high= "+high);
        return (i+1);
    }
}
