package com.example.datastructures.datastructures;

class Node{
    int key;
    Node left,right;
}

public class BinarySearchTree {

    public static void main(String arg[]){
        BinarySearchTree bs = new BinarySearchTree();
        Node root=null;
        root = bs.insert(root,50);
        bs.insert(root,30);
        bs.insert(root,20);
        bs.insert(root,40);
        bs.insert(root,70);
        bs.insert(root,60);
        bs.insert(root,80);
        bs.insert(root,55);
        bs.insert(root,65);
        bs.insert(root,51);
        bs.insert(root,56);
        System.out.print("inOrder");
        bs.inOrder(root);
        System.out.println();
        System.out.print("preOrder");
        bs.preOrder(root);
        System.out.println();
        System.out.print("PostOrder");
        bs.postOrder(root);
        System.out.println();

        System.out.println("LevelOrder");
        bs.printLevelOrder(root);

        System.out.println("LevelOrder 2");
        bs.printGivenLevel(root,2);
        System.out.println();
        System.out.println("LevelOrder 3");
        bs.printGivenLevel(root,3);

        System.out.println();
        System.out.println("Leaf Nodes");
        bs.printLeafNodes(root);

        System.out.println();
        System.out.println("NON Leaf Nodes");
        bs.printNONLeafNodes(root);

        System.out.println();
        System.out.println("Delete Nodes 60");
        bs.deleteNode(root,60);
        bs.inOrder(root);

        System.out.println("LevelOrder");
        bs.printLevelOrder(root);

        System.out.println("After Insert Nodes 60");
        bs.insert(root,60);
        bs.inOrder(root);
    }

    private Node deleteNode(Node root, int key) {
        if(root == null){
            return root;
        }
        if(key< root.key) {
            root.left = deleteNode(root.left,key);
        } else if(key> root.key){
            root.right = deleteNode(root.right,key);
        } else {
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return  root.left;
            }
            Node temp = maxValueNode(root.left);
            root.key = temp.key;
            root.left = deleteNode(root.left,temp.key);
        }
        return root;
    }

    private Node minValueNode(Node node) {
            Node current = node;
            while(current!=null && current.left!=null){
                current = current.left;
            }
            return current;
    }
    private Node maxValueNode(Node node) {
        Node current = node;
        while(current!=null && current.right!=null){
            current = current.right;
        }
        return current;
    }

    private void printLeafNodes(Node root) {
        if(root==null){
            return ;
        }
        if(root.left == null && root.right == null){
            System.out.print(" "+root.key);
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    private void printNONLeafNodes(Node root) {
        if(root==null){
            return ;
        }
        if(root.left != null && root.right != null){
            System.out.print(" "+root.key);
        }
        printNONLeafNodes(root.left);
        printNONLeafNodes(root.right);
    }

    private void printLevelOrder(Node root) {
        int h = height(root);
        for(int i=1;i<=h;i++){
            printGivenLevel(root,i);
            System.out.println();
        }
    }

    private void printGivenLevel(Node root, int level) {
        if(root == null){
            return;
        } else if(level == 1){
            System.out.print(" "+root.key);
        } else if(level>1){
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }

    private int height(Node root) {
        if(root==null){
            return 0;
        }
        int lDepth = height(root.left);
        int rDepth = height(root.right);

        if(lDepth>rDepth){
            return lDepth+1;
        } else {
            return rDepth+1;
        }
    }

    private void inOrder(Node root) {
        if(root!=null){
            inOrder(root.left);
            System.out.print(" "+root.key);
            inOrder(root.right);
        }
    }
    private void preOrder(Node root){
        if(root!=null){
            System.out.print(" "+root.key);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    private void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" "+root.key);
        }
    }

    private Node insert(Node node, int key) {
        if(node == null){
            return  newNode(key);
        }
        if(key < node.key){
            node.left = insert(node.left,key);
        }
        if(key > node.key){
            node.right = insert(node.right,key);
        }
        return node;
    }

    private Node newNode(int key) {
        Node temp = new Node();
        temp.key = key;
        temp.right = temp.left = null;
        return temp;
    }
}
