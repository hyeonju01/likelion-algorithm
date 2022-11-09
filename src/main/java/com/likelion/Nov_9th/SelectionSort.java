package com.likelion.Nov_9th;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        selectionSort.sort(arr);
    }

    private void sort(int[] arr) {
        //idx 0부터 시작하여 가장 작은 값을 넣고, idx ++하여 반복한다.
        // idx = 0, arr[0] ~ arr[arr.length] 중 가장 작은 값
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) {
                minIdx = i;
            }
        }
        // idx = 1, arr[1] ~ arr[arr.length] 중 가장 작은 값



    }

}
