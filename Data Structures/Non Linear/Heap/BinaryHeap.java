package dsa.datastructures.heap;

import java.util.Arrays;

public class BinaryHeap {
    private int[] heap; private int size;
    public BinaryHeap(int capacity){ heap=new int[capacity]; }
    public void insert(int key){ if(size==heap.length) heap=Arrays.copyOf(heap, heap.length*2+1); heap[size]=key; trickleUp(size++); }
    public int remove(){ if(size==0) throw new IllegalStateException("empty"); int root=heap[0]; heap[0]=heap[--size]; trickleDown(0); return root; }
    private void trickleUp(int idx){ int parent; int bottom=heap[idx]; while(idx>0 && heap[parent=(idx-1)/2] < bottom){ heap[idx]=heap[parent]; idx=parent; } heap[idx]=bottom; }
    private void trickleDown(int idx){ int top=heap[idx]; while(idx*2+1<size){ int left=idx*2+1, right=left+1; int larger = (right<size && heap[right]>heap[left]) ? right : left; if(heap[larger] <= top) break; heap[idx]=heap[larger]; idx=larger; } heap[idx]=top; }
}

