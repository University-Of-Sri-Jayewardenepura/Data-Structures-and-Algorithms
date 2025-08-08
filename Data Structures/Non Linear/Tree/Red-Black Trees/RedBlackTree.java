package dsa.datastructures.tree;

public class RedBlackTree<T extends Comparable<T>> {
    private static final boolean RED=true, BLACK=false;
    static class Node<T>{ T key; Node<T> left,right,parent; boolean color=RED; Node(T k){key=k;} }
    private Node<T> root;

    public void insert(T key){ Node<T> z=new Node<>(key); bstInsert(z); fixAfterInsert(z); }
    private void bstInsert(Node<T> z){ Node<T> y=null,x=root; while(x!=null){ y=x; int cmp=z.key.compareTo(x.key); x = cmp<0? x.left : x.right; } z.parent=y; if(y==null) root=z; else if(z.key.compareTo(y.key)<0) y.left=z; else y.right=z; }

    private void rotateLeft(Node<T> x){ Node<T> y=x.right; x.right=y.left; if(y.left!=null) y.left.parent=x; y.parent=x.parent; if(x.parent==null) root=y; else if(x==x.parent.left) x.parent.left=y; else x.parent.right=y; y.left=x; x.parent=y; }
    private void rotateRight(Node<T> x){ Node<T> y=x.left; x.left=y.right; if(y.right!=null) y.right.parent=x; y.parent=x.parent; if(x.parent==null) root=y; else if(x==x.parent.right) x.parent.right=y; else x.parent.left=y; y.right=x; x.parent=y; }

    private void fixAfterInsert(Node<T> z){ while(z!=root && colorOf(parentOf(z))==RED){ if(parentOf(z)==leftOf(parentOf(parentOf(z)))){ Node<T> y=rightOf(parentOf(parentOf(z))); if(colorOf(y)==RED){ setColor(parentOf(z),BLACK); setColor(y,BLACK); setColor(parentOf(parentOf(z)),RED); z=parentOf(parentOf(z)); } else { if(z==rightOf(parentOf(z))){ z=parentOf(z); rotateLeft(z);} setColor(parentOf(z),BLACK); setColor(parentOf(parentOf(z)),RED); rotateRight(parentOf(parentOf(z))); } } else { Node<T> y=leftOf(parentOf(parentOf(z))); if(colorOf(y)==RED){ setColor(parentOf(z),BLACK); setColor(y,BLACK); setColor(parentOf(parentOf(z)),RED); z=parentOf(parentOf(z)); } else { if(z==leftOf(parentOf(z))){ z=parentOf(z); rotateRight(z);} setColor(parentOf(z),BLACK); setColor(parentOf(parentOf(z)),RED); rotateLeft(parentOf(parentOf(z))); } } } setColor(root,BLACK); }

    private static <T> boolean colorOf(Node<T> n){ return n==null? BLACK : n.color; }
    private static <T> Node<T> parentOf(Node<T> n){ return n==null? null : n.parent; }
    private static <T> Node<T> leftOf(Node<T> n){ return n==null? null : n.left; }
    private static <T> Node<T> rightOf(Node<T> n){ return n==null? null : n.right; }
    private static <T> void setColor(Node<T> n, boolean c){ if(n!=null) n.color=c; }
}

