package com.likelion.Nov_3rd;

import java.util.Arrays;

public class PrimeFinderNoModulor {
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1]; // 49개
        boolean[] checks = new boolean[nums.length]; //nums 크기와 동일한 checks 배열 생성
        Arrays.fill(checks, true); //checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) nums[i] = i+2;

        //2의 배수 지우기
        // 0 1 2 3 4 5 6 7  8  9 10 11 12 13 14 15 16 17 18
        // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ... 50
        int multipleOf = 2;
        for (int i = 0;  i < nums.length; i+= 2) {
            checks[i] = false;
        }

        // checks 배열에서 true인 nums[i]만 출력
        for (int i = 0; i < nums.length; i++) {
            if (checks[i] == true) {
                System.out.print(nums[i]);
            }
        }

    }
}