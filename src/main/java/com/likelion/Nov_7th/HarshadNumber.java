package com.likelion.Nov_7th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HarshadNumber {

        /*
        10000 / 10 = 1000 (나머지 = 0)
        1000 / 10 = 100 (나머지 = 0)
        100 / 10 = 10 (나머지 = 0)
        10 / 10 = 1 (나머지 = 0)
        1 / 10 = 0 (나머지 = 1)
        */

    public boolean solution(int x) {
        boolean answer = true;
        int sumOfDigit = 0;
        while (x / 10 > 0) {
            sumOfDigit += x % 10;
            x = x / 10;
        }
        //System.out.println(sumOfDigit); //자릿수 합
        if (x % sumOfDigit ==0) {
            return answer;
        } else answer = false;

        return answer;
    }


    public static void main(String[] args) {

        //Scanner sc =new Scanner(System.in);
        HarshadNumber harshadNumber = new HarshadNumber();
        //int x = sc.nextInt();
        System.out.println(harshadNumber.solution(1919));
    }
}
