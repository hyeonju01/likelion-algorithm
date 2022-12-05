package com.likelion.Dec_5th;

import java.util.Arrays;

/*
부모의 인덱스를 입력하면 왼쪽, 오른쪽 자식의 인덱스를 리턴하는 함수
 */
public class Heap2 {
    public static String getChildIndex(int index) {
        int[] childIndexArr = new int[2];
        childIndexArr[0] = 2 * index + 1;
        childIndexArr[1] = 2 * index + 2;
        return Arrays.toString(childIndexArr);
    }
    public static void main(String[] args) {
        System.out.println(getChildIndex(0));
        System.out.println(getChildIndex(1));
        System.out.println(getChildIndex(33));
    }
}
