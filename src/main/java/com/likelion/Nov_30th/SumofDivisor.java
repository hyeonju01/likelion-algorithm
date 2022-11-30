package com.likelion.Nov_30th;

import java.util.ArrayList;
import java.util.List;

public class SumofDivisor {
    public int solution(int n) {
        int answer = 0;
        List list = new ArrayList();
        /*
        n%1 ==0 -> 1
        n%2 ==0 -> 2
         */
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer = answer + ((int) list.get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        SumofDivisor sod = new SumofDivisor();
        System.out.println(sod.solution(12));
        System.out.println(sod.solution(5));
    }
}
