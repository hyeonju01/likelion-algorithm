package com.likelion.Nov_29th;

public class RadixSort {

    public static void main(String[] args) {
        int[] unsortedNum = new int[]{7,4,5,9,1,0}; // 0 1 2 3 4 5
        int[] radixArr = new int[10]; //0 1 2 3 4 5 6 7 8 9

        for (int i = 0; i < unsortedNum.length; i++) {
            int num = unsortedNum[i];
            radixArr[num] = num;
        }

        for (int num: radixArr) {
            if (num != 0){
                System.out.println(num);
            }
        }
    }
}
