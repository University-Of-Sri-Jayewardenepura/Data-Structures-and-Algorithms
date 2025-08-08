package dsa.linear;

public class SortedLinkedList<T extends Comparable<T>> {
    private static class Node<T> { T data; Node<T> next; Node(T d){data=d;} }
    private Node<T> head; private int size;
    public void insert(T v){ Node<T> n=new Node<>(v); if(head==null || head.data.compareTo(v) >= 0){ n.next=head; head=n; }
        else { Node<T> cur=head; while(cur.next!=null && cur.next.data.compareTo(v) < 0) cur=cur.next; n.next=cur.next; cur.next=n; } size++; }
    public boolean remove(T v){ if(head==null) return false; if(head.data.equals(v)){ head=head.next; size--; return true;} Node<T> cur=head; while(cur.next!=null && !cur.next.data.equals(v)) cur=cur.next; if(cur.next==null) return false; cur.next=cur.next.next; size--; return true; }
    public int size(){ return size; }
}

