package com.example.datastructures;

public class BitwiseOperatorExample {
    public static void main(String str[]){
//        0 1 2 4 8 16 32
//        0 0 1 0 1 0 0 0
//        1 0 1 0 0 0 0 0 rightShift
//        0 0 0 0 1 0 1 0 leftShift
        int n=10;
        System.out.println("Right = "+(n>>2));
        System.out.println("Left = "+(n<<2));
        System.out.println("Exponential = "+ (8^(3)));
        StringBuilder stringBuilder = new StringBuilder();
        while(n>0){
            int reminder = n%2;
            stringBuilder.append(reminder);
            n = n/2;
        }
        System.out.println("Before = "+stringBuilder);
        stringBuilder  = stringBuilder.reverse();
        System.out.println("After = "+stringBuilder);
        System.out.println("Data Structures and Algorithms");
    }
}