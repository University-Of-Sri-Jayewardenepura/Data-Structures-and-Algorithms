package dsa.datastructures.tree;

public class BinarySearchTree {
    static class Node { int key; Node left, right; Node(int k){key=k;} }
    private Node root;

    public void insert(int key){ root = insertRec(root, key); }
    private Node insertRec(Node x, int key){ if (x==null) return new Node(key); if (key < x.key) x.left = insertRec(x.left, key); else x.right = insertRec(x.right, key); return x; }

    public boolean find(int key){ return findRec(root, key) != null; }
    private Node findRec(Node x, int key){ if (x==null) return null; if (key==x.key) return x; return key < x.key ? findRec(x.left,key) : findRec(x.right,key); }

    public void delete(int key){ root = deleteRec(root, key); }
    private Node deleteRec(Node x, int key){ if (x==null) return null; if (key < x.key) x.left = deleteRec(x.left,key); else if (key > x.key) x.right = deleteRec(x.right,key); else { if (x.left==null) return x.right; if (x.right==null) return x.left; Node t = min(x.right); x.key = t.key; x.right = deleteMin(x.right); } return x; }
    private Node deleteMin(Node x){ if (x.left==null) return x.right; x.left = deleteMin(x.left); return x; }
    private Node min(Node x){ while (x.left!=null) x=x.left; return x; }

    public void inorder(){ inorderRec(root); System.out.println(); }
    private void inorderRec(Node x){ if (x==null) return; inorderRec(x.left); System.out.print(x.key+" "); inorderRec(x.right); }
}

