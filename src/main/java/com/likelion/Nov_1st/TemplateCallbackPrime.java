package com.likelion.Nov_1st;


interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    // i < num
    // i < num / 2
    // i * i < num

//    boolean someOperation (int a, int b){
//        return a < b;
//    }

    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime2(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num/2); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime3(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i*i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // lambda 사용
    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13, (a, b) -> a<b));
        System.out.println(tcp.isPrime(17, (a, b) -> a<b/2));
        System.out.println(tcp.isPrime(19, (a, b) -> a*a <= b));
    }
}