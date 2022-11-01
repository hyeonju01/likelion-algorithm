package com.likelion.Nov_1st;

public class PrimeFinder {

    public boolean isPrime(int num) {
        boolean answer = true;
        for (int i=2; i < num; i++) {
            if ((num % i) != 0) {
                continue;
            } else {
                answer = false;
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrimeFinder pf = new PrimeFinder();
        System.out.println(pf.isPrime(13));
        System.out.println(pf.isPrime(17));
        System.out.println(pf.isPrime(19));
        System.out.println(pf.isPrime(23));
    }
}
