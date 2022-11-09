package com.likelion.Nov_9th;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(Arrays.toString(selectionSort.sortDescending(arr)));
    }

    private int[] sort(int[] arr) {
        //idx 0부터 시작하여 가장 작은 값을 넣고, idx ++하여 반복한다.
        // idx = 0, arr[0] ~ arr[arr.length] 중 가장 작은 값
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }

        return arr;
    }

    public int[] sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIdx = i;
            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = tmp;
        }
        return arr;
    }
}