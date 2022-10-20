package com.likelion;

import java.util.ArrayList;

public class Stack01 {
    private int[] arr = new int[10000];
    //private List<Integer> arl = new ArrayList<>();
    //list.push() -> array를 새로 만든다.
    // new int[10001]
    // 10만개, 20만개일 때 list에 싹 복사해서 다시 넣기 때문에 느려짐
    private int pointer = 0; //스택 가장 위의 값을 가리키는 인덱스

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer ++;
        //return this.arr;
    }

    public int pop() {
        int value = this.arr[this.pointer - 1];
        this.pointer --;
        return value;
    }

    public int[] getArr() {
        return arr;
    }
}