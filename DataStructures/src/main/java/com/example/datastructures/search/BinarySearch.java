package com.example.datastructures.search;

public class BinarySearch {
/*
Binary search is one of the searching techniques applied when the input is sorted here we are focusing on finding the middle element that acts as a reference frame whether to go left or right to it as the elements are already sorted. This searching helps in optimizing the search technique with every iteration is referred to as binary search and readers do stress over it as it is indirectly applied in solving questions.

Start
Take input array and Target
Initialise start = 0 and end = (array size -1)
Intialise mid variable
mid = (start+end)/2
if array[ mid ] == target then return mid
if array[ mid ] < target then start = mid+1
if array[ mid ] > target then end = mid-1
if start<=end then goto step 5
return -1 as Not element found
Exit
 */
    public static void main(String[] arg){
        BinarySearch ob = new BinarySearch();
        int[] arr = {2,3,4,10,40};
        int n= arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index ="+result);
    }

    private int binarySearch(int[] arr, int start, int end, int x) {
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                return mid;
            } else if(arr[mid]>x){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}
