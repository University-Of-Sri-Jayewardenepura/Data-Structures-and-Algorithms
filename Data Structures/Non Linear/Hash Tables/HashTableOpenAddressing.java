package dsa.datastructures.hash;

import java.util.Arrays;

public class HashTableOpenAddressing {
    private static class Entry { int key; int value; boolean deleted; Entry(int k,int v){key=k;value=v;} }
    private Entry[] table; private int size; private final double loadFactor = 0.6;

    public HashTableOpenAddressing(int capacity){ table = new Entry[nextPrime(capacity)]; }

    private int hash(int key){ return Math.floorMod(key, table.length); }
    private int step(int key){ return 1 + Math.floorMod(key, table.length-2); }

    public void put(int key, int value){
        if ((size + 1.0) / table.length > loadFactor) resize();
        int idx = hash(key), step = step(key);
        while (table[idx] != null && !table[idx].deleted && table[idx].key != key) idx = (idx + step) % table.length;
        if (table[idx] == null || table[idx].deleted) { table[idx] = new Entry(key, value); size++; }
        else table[idx].value = value;
    }

    public Integer get(int key){
        int idx = hash(key), step = step(key);
        while (table[idx] != null) {
            if (!table[idx].deleted && table[idx].key == key) return table[idx].value;
            idx = (idx + step) % table.length;
        }
        return null;
    }

    public boolean remove(int key){
        int idx = hash(key), step = step(key);
        while (table[idx] != null) {
            if (!table[idx].deleted && table[idx].key == key) { table[idx].deleted = true; size--; return true; }
            idx = (idx + step) % table.length;
        }
        return false;
    }

    private void resize(){
        Entry[] old = table;
        table = new Entry[nextPrime(table.length * 2)];
        size = 0;
        for (Entry e : old) if (e != null && !e.deleted) put(e.key, e.value);
    }

    private static boolean isPrime(int n){ if (n < 2) return false; for (int i=2;i*i<=n;i++) if (n%i==0) return false; return true; }
    private static int nextPrime(int n){ while (!isPrime(n)) n++; return n; }

    @Override public String toString(){ return Arrays.toString(Arrays.stream(table).map(e -> e==null?null:(e.deleted?"X":(e.key+":"+e.value))).toArray()); }
}

