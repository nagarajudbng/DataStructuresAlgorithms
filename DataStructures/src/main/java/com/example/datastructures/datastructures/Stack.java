package com.example.datastructures.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StackNode{
    int data;
    StackNode next;
    public StackNode(int data){
        this.data = data;
        next = null;
    }
}

public class Stack {
    StackNode root;
    void push(int data){
        StackNode newNode = new StackNode(data);
        if (root != null) {
            StackNode temp = root;
            newNode.next = root;
        }
        root = newNode;
        System.out.println("Pushed value = "+data);
    }
    int pop(){
        int popped = Integer.MAX_VALUE;
        if(root ==null){
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
    int peek(){
        if(root == null){
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        } else {
            return root.data;
        }
    }
    void display(){
        StackNode temp = root;

        if(temp ==null){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Contains following elements");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] art) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int[] n = {1,2,3,4,5,6};
        float digit = Math.round((float)(((float)n.length) /2));
        System.out.println("digit = " + digit);
    }
    void execute()
    {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack peek value = "+stack.peek());
        stack.display();
        System.out.println("Stack popped value = "+stack.pop());
        System.out.println("Stack peek value = "+stack.peek());
        stack.display();
        System.out.println("Stack popped value = "+stack.pop());
        System.out.println("Stack popped value = "+stack.pop());
        stack.display();
        int i = -1;

        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.println("Select Options");
//            Scanner scanner = new Scanner(System.in);
            i = 1;//Integer.parseInt(scanner.next());
            switch (i){
                case 1:
                    System.out.println("Enter Value");
//                    int n = scanner.nextInt();
//                    stack.push(n);
                case 2:
                    stack.pop();
                case 3:
                    while(stack.root!=null && stack.root.next!=null){
                        System.out.println(stack.root.data);
                    }
            }

        }while (i>=0);

    }

}
