package com.likelion.Nov_15th;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort1 {
    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        int midnum = 0;
        midnum = arr[arr.length/2];
        mid.add(midnum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > midnum) {
                right.add(arr[i]);
            } else {
                left.add(arr[i]);
            }
        }

        int[] leftArr = new int[left.size()];
        int[] rightArr = new int[right.size()];
        int[] midArr = new int[mid.size()];

        for (int i = 0; i < left.size(); i++) {
            leftArr[i] = left.get(i).intValue();
        }
        for (int i = 0; i < right.size(); i++) {
            rightArr[i] = right.get(i).intValue();
        }
        for (int i = 0; i < mid.size(); i++) {
            midArr[i] = mid.get(i).intValue();
        }

        System.out.println("원래 정렬은: " + arr);
        System.out.println("pivot: " + Arrays.toString(midArr));
        System.out.println("피봇 왼쪽 정렬은: " + Arrays.toString(leftArr));
        System.out.println("피봇 오른쪽 정렬은: " + Arrays.toString(rightArr));
    }
}
