package com.likelion.Nov_2nd;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FasterPrimeFinderUsingEraAlgo {

    public int solution(int N) {
        Integer[] nums = new Integer[N-1];
        boolean[] checks = new boolean[N];
        int firstNum = 2;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = firstNum;
            firstNum ++;
        }
        Arrays.fill(checks, true);
        int PrimeCheckCnt = 0;

        // 루트 N 이하 수까지 배수 지우기
        for (int j = 2; j * j <= N; j++) {
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] % j == 0) && (nums[i] > j)) {
                    checks[i] = false;
                }
            }
        }

        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) {
                PrimeCheckCnt += 1;
            }
        }
        return PrimeCheckCnt;
    }

    public static void main(String[] args) {
        FasterPrimeFinderUsingEraAlgo pf = new FasterPrimeFinderUsingEraAlgo();
        System.out.println(pf.solution(50));
    }
}
