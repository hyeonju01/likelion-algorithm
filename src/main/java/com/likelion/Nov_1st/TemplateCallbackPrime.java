package com.likelion.Nov_1st;

public class TemplateCallbackPrime {
    // i < num
    // i < num / 2
    // i * i < num

    boolean someOperation (int a, int b){
        return a < b;
    }

    boolean isPrime(int num) {
        for (int i = 2; someOperation(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime2(int num) {
        for (int i = 2; someOperation(i, num/2); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    boolean isPrime3(int num) {
        for (int i = 2; someOperation(i, (int) Math.sqrt(num)); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        System.out.println(tcp.isPrime(13));
    }
}
