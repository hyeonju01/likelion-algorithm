package com.likelion.Nov_24th;

/*
재귀를 사용하여 피보나치 수열 구현하기
 */

public class Fibonacchi {

    public static int fib(int n) {
        if( n == 1 | n == 2) {
            /*
            fib(1) = 1
            fib(2) = 1
             */
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int r = fib(6);
        System.out.println(r);

    }
}
