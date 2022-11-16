package com.likelion.Nov_16th;

public class QuickSort2 {
    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr[arr.length/2] ;
        System.out.println(pivot);
        int idxFromL = 0; //left index
        int idxFromR = arr.length - 1; //right index

        // pivot까지 leftIndex 증가시키기
        while (arr[idxFromL] < pivot) {
            idxFromL += 1;
        }

        while (arr[idxFromR] > pivot) {
            idxFromR -= 1;
        }

        System.out.println(idxFromL);
        System.out.println(idxFromR);

        int temp = arr[idxFromL];
        arr[idxFromL] = arr[idxFromR];
        arr[idxFromR] = temp;
        idxFromL += 1;
        idxFromR -= 1;

        System.out.printf("4: %d 7: %d%n", arr[4], arr[7]); // 25, 40
        System.out.printf("leftIdx:%d rightIdx:%d%n", idxFromL, idxFromR); // 5, 6

    }
}
