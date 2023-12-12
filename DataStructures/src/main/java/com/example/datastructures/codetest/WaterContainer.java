package com.example.datastructures.codetest;

class WaterContainer {
    public int maxArea(int[] height) {
        int area = 0;
        int indexA = 0;
        int indexB = height.length - 1;

        while (indexA<indexB){
            int min = Math.min(height[indexA],height[indexB]);
            int steps = Math.abs(indexB-indexA);

            int candidateArea = min*steps;

            area = Math.max(area,candidateArea);

            if (height[indexA] <= height[indexB]) {
                indexA++;
            } else {
                indexB--;
            }
        }
        return area;
    }
    public static void main(String[] str){
//        int[] n = {1,8,6,2,5,4,8,3,7};
//        int[] n = {1,1};
        int[] n = {2,3,4,5,18,17,6};
        int output= new WaterContainer().maxArea(n);
        System.out.println("MaxArea = "+output);
    }
}

