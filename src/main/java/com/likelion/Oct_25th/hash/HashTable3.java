package com.likelion.Oct_25th.hash;

import java.util.ArrayList;
import java.util.List;

// 구현
public class HashTable3 {
    class Node {

        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    List<Node>[] table = new ArrayList[1000];

    public int hash(String str) {
        int asciiSum = 0;
        for (int i = 0; i < str.length(); i++) {
            asciiSum += str.charAt(i);
        }
        return asciiSum % 1000;
    }

    // insert 튜닝
    public void insert(String key, Integer value) {
        int hashIdx = hash(key);
        if(this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key, value));
    }

    // get 튜닝
    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node: nodes) {
            if (key.equals(node.getKey())) {
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable3 ht = new HashTable3();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);
        int result = ht.get("Yoonseo");

        if (ht.get("Yoonseo") == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result );
        }

        result = ht.get("Seoyoon");

        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result );
        }
    }
}