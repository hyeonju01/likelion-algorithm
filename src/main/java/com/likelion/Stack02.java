package com.likelion;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }
    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        this.arr[top] = value;
        this.top ++;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int value = this.arr[this.top - 1];
        this.top --;
        return value;
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
        // return this.top == 0;
    }
}