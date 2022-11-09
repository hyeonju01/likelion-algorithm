package com.likelion.Nov_9th;

import java.util.Arrays;

// a, b 값 두 개를 받아서 boolean을 리턴하는 인터페이스 선언 (템플릿 콜백 패턴)
interface StatementStrategy {
    boolean apply(int a, int b);
}
public class SelectionSort2 {

    public int[] SelectionSort(int[] arr, StatementStrategy stmt) {
        for (int i = 0; i < arr.length; i++) {
            int Idx = i;
            int tmp = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (stmt.apply(arr[Idx], arr[j])) {
                    Idx = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[Idx];
            arr[Idx] = tmp;
        }
        return arr;
    }

    public int[] SelectionSortDesc(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort2 selectionSort = new SelectionSort2();
        // Lambda 적용
        System.out.println(Arrays.toString(selectionSort.SelectionSort(arr, (a, b) -> a < b))); // arr[Idx] < arr[j] -> arr[Idx]는 maxIdxValue, 내림차순
        System.out.println(Arrays.toString(selectionSort.SelectionSort(arr, (a, b) -> a > b))); // arr[Idx] > arr[j] -> arr[Idx]는 minIdxValue, 오름차순
    }
}