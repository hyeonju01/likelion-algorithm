package com.likelion.Nov_8th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DataSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //n개의 데이터 입력 받기
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int k = Integer.parseInt(br.readLine()); // 목표 수 k
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(i);;
            }
            System.out.println(-1);
        }
    }
}
