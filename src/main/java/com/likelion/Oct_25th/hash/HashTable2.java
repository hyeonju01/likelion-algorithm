package com.likelion.Oct_25th.hash;

// 구현
public class HashTable2 {
    private int size;
    private int[] HashTable = new int[size];


    public HashTable2() {
    }

    public HashTable2(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        this.HashTable[hashCode] = value;
    }

    public int search(String key) {
        return this.HashTable[hash(key)];
    }

    public static void main(String[] args) {
        HashTable2 ht = new HashTable2();
        String[] arr = {"1", "2", "3", "4"};
        for (int i = 0; i < arr.length; i++){
            int hashValue = ht.hash(arr[i]);
            ht.insert(arr[i], hashValue);
        }
    }
}
