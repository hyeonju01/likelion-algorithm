package com.likelion.Nov_8th;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int k = sc.nextInt();
        int answer = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
