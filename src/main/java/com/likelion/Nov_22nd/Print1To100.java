package com.likelion.Nov_22nd;

public class Print1To100 {
    public static void print1To100(int n){
        System.out.println(n);
        n--;
        if (n > 0) {
            print1To100(n);
        }
    }

    public static void main(String[] args) {
        print1To100(1);
    }
}