package com.likelion.Nov_25th;

import java.util.Scanner;

/*
codeup:
 */
public class GCD {

    public static int gcd(int a, int b) {
        if (a == b) { //두 수가 같으면 최대 공약수는 a
            return a;
        } else if (a > b) {
            return gcd(a-b, b);
        }else if ( a < b ) {
            return gcd(a, b-a);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GCD gcd = new GCD();
        System.out.println(gcd.gcd(a, b));
    }
}
