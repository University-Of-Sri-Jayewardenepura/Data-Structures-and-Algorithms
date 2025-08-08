package dsa.linear;

public class SinglyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> head;
    private int size;

    public void insertFirst(T value) {
        Node<T> n = new Node<>(value);
        n.next = head;
        head = n;
        size++;
    }

    public void insertLast(T value) {
        Node<T> n = new Node<>(value);
        if (head == null) {
            head = n;
        } else {
            Node<T> cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = n;
        }
        size++;
    }

    public boolean deleteFirst() {
        if (head == null) return false;
        head = head.next;
        size--;
        return true;
    }

    public boolean deleteValue(T value) {
        if (head == null) return false;
        if ((head.data == null && value == null) || (head.data != null && head.data.equals(value))) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> prev = head;
        Node<T> cur = head.next;
        while (cur != null) {
            if ((cur.data == null && value == null) || (cur.data != null && cur.data.equals(value))) {
                prev.next = cur.next;
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public Node<T> find(T value) {
        Node<T> cur = head;
        while (cur != null) {
            if ((cur.data == null && value == null) || (cur.data != null && cur.data.equals(value))) return cur;
            cur = cur.next;
        }
        return null;
    }

    public int size() { return size; }

    public void display() {
        Node<T> cur = head;
        StringBuilder sb = new StringBuilder("[");
        while (cur != null) {
            sb.append(cur.data);
            cur = cur.next;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb);
    }
}

