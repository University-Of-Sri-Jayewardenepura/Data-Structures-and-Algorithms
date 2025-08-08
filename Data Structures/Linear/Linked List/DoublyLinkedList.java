package dsa.linear;

public class DoublyLinkedList<T> {
    private static class Node<T> { T data; Node<T> prev,next; Node(T d){data=d;} }
    private Node<T> head, tail; private int size;
    public void insertFirst(T v){ Node<T> n=new Node<>(v); if(head==null){head=tail=n;} else {n.next=head; head.prev=n; head=n;} size++; }
    public void insertLast(T v){ Node<T> n=new Node<>(v); if(tail==null){head=tail=n;} else {tail.next=n; n.prev=tail; tail=n;} size++; }
    public T deleteFirst(){ if(head==null) return null; T d=head.data; head=head.next; if(head!=null) head.prev=null; else tail=null; size--; return d; }
    public T deleteLast(){ if(tail==null) return null; T d=tail.data; tail=tail.prev; if(tail!=null) tail.next=null; else head=null; size--; return d; }
    public int size(){ return size; }
}

