package com.example.datastructures.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] arg){
        int arr[] = {12,11,13,5,6,7};
        int N = arr.length;

        HeapSort hp = new HeapSort();
        hp.sort(arr);

        hp.printArray(arr);
;    }

    private void sort(int arr[]) {
        int N = arr.length;

        //Build heap (rearrange array)
        for(int i=N/2-1;i>=0;i--){
            heapify(arr,N,i,false);
            System.out.println("Build heap "+ Arrays.toString(arr));
        }

        //One by one extract an element from heap
        for(int i=N-1;i>0;i--){
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr,i,0,false);
            System.out.println("One by one "+ Arrays.toString(arr));
        }
    }
    /* A utility function to print array of size n */
    public void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void heapify(int[] arr, int n, int i,boolean recursive) {
            int large = i;
            int l = 2*i+1;
            int r = 2*i+2;
            System.out.println((recursive?"Recursive ":"")+"n="+n+", i="+i+", large="+large+", " +
                    "l="+l+
                    ", r="+r);

            if(l<n && arr[l]>arr[large]){
                large = l;
            }
            if(r<n && arr[r]>arr[large]){
                large = r;
            }
            if(large != i){
                int swap = arr[i];
                arr[i] = arr[large];
                arr[large] = swap;
                System.out.println("if Before recursive = "+ Arrays.toString(arr));
                heapify(arr,n,large,true);
                System.out.println("if after recursive = "+ Arrays.toString(arr));
            }
    }
}
