package com.likelion.Nov_14th;

import java.util.Arrays;

/*
에라토스테네스의 체 복습
 */
public class EraRecap {
/*
 기존 배열의 합성수를 0으로 바꿔준다. (check 배열을 만들지 않는다.)
 장점- 공간복잡도를 50% 아낄 수 있다.
 */

    public static void main(String[] args) {
        // 정수(2~50) 배열 초기화
        int[] arr = new int[49];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
    }
}
