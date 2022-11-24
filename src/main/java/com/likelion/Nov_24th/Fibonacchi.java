package com.likelion.Nov_24th;

/*
재귀를 사용하여 피보나치 수열 구현하기
[코드업 1855] [기초-재귀함수] 재귀로 n번째 피보나치 수 리턴하기
 */

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));

    }
}
