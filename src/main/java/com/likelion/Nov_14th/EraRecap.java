package com.likelion.Nov_14th;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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

        for (int j = 2; j * j <= 50; j++) {
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % j == 0) && (arr[i] > j)) {
                    arr[i] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        // 소수 개수 반환
        int PrimeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                PrimeCount ++;
            }
        }
        System.out.println(PrimeCount);

    }
}
