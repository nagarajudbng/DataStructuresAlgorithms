package com.example.datastructures.sort;

import java.util.Arrays;

//Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. Repeat the same process for the remaining elements.

/*
First convert the array into heap data structure using heapify, then one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap. Repeat this process until size of heap is greater than 1.

Build a heap from the given input array.
Repeat the following steps until the heap contains only one element:
-Swap the root element of the heap (which is the largest element) with the last element of the heap.
-Remove the last element of the heap (which is now in the correct position).
-Heapify the remaining elements of the heap.
The sorted array is obtained by reversing the order of the elements in the input array.
 */
/*
Advantages of Heap Sort:
Efficient Time Complexity: Heap Sort has a time complexity of O(n log n) in all cases. This makes it efficient for sorting large datasets. The log n factor comes from the height of the binary heap, and it ensures that the algorithm maintains good performance even with a large number of elements.
Memory Usage – Memory usage can be minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work
Simplicity –  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion.
 */

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
