package com.likelion.Nov_22nd;

public class Print1To100 {
    public static void print1To100(int n){
        if (n > 100) {
            return;
        }
        System.out.println(n);
        n++;
        print1To100(n);
    }

    public static void main(String[] args) {
        print1To100(1);
    }
}