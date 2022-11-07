package com.likelion.Nov_7th;

import com.likelion.Nov_1st.PrimeFinder2;

import java.lang.reflect.Array;
import java.util.*;

public class DivisionArr {
    public int[] solution(int[] arr, int divisor) {

        // 1. list 이용
        /*
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            return new int[] {-1};
        }

        // list를 array로 바꾸고 sort한 것을 return
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        */

        // 2. priorityQueue
        PriorityQueue<Integer> list = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            return new int[] {-1};
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        while (!list.isEmpty()) {
            answer[idx++] =  list.poll();
        }

        // return
        return answer;
    }

    public static void main(String[] args) {
        DivisionArr divisionArr = new DivisionArr();
        int[] arr = {3, 2, 6};
        System.out.println(Arrays.toString(divisionArr.solution(arr, 5)));
    }
}
