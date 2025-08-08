package dsa.algorithms.trees;

import dsa.datastructures.tree.BinarySearchTree;

public class TreeTraversalsDemo {
    public static void main(String[] args){ BinarySearchTree bst=new BinarySearchTree(); int[] keys={50,30,70,20,40,60,80}; for(int k:keys) bst.insert(k); bst.inorder(); }
}

