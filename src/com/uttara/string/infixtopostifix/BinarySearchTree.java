package com.uttara.string.infixtopostifix;

class Node {
    public int data;
    public Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 

public class BinarySearchTree
{

    Node insert(Node node, int data)
    {
        /* 1. If the tree is empty, return a new,    
         single node */
        if (node == null) {
            return (new Node(data));
        } else {
             
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data ) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    }
    int minvalue(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }
    int maxvalue(Node node) {
        Node current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }
    
    public static void main(String[] args) {
        BinarySearchTree  binarySearchTree = new BinarySearchTree();
        Node root = null;
        root = binarySearchTree.insert(root, 11);
        binarySearchTree.insert(root, 3);
        binarySearchTree.insert(root, 6);
        binarySearchTree.insert(root, 5);
        System.out.println("Minimum value of BST is " + binarySearchTree.minvalue(root));
        System.out.println("Maximum value of BST is " + binarySearchTree.maxvalue(root));
    }
}