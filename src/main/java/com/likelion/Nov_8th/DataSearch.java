package com.likelion.Nov_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
CodeUp 3001: 데이터 탐색 (에러 수정 완료)
 */
public class DataSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(numbers));
        int k = Integer.parseInt(br.readLine());
        int answer = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
}
