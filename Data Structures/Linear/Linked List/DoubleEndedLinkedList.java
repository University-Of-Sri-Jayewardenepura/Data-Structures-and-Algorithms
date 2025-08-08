package dsa.linear;

public class DoubleEndedLinkedList<T> {
    private static class Node<T>{ T data; Node<T> next; Node(T d){data=d;} }
    private Node<T> head, tail; private int size;
    public void insertFirst(T v){ Node<T> n=new Node<>(v); if(head==null){head=tail=n;} else { n.next=head; head=n; } size++; }
    public void insertLast(T v){ Node<T> n=new Node<>(v); if(tail==null){head=tail=n;} else { tail.next=n; tail=n; } size++; }
    public T deleteFirst(){ if(head==null) return null; T d=head.data; head=head.next; if(head==null) tail=null; size--; return d; }
    public int size(){ return size; }
}

