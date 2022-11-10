package com.likelion.Nov_10th;

import java.util.ArrayList;
import java.util.List;

// Solution1- No Stack
public class DeleteDuplicateNumber {

    public int[] solution(int [] arr) {

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int index = answerList.size() - 1;
            if (answerList.get(index) != arr[i]) {
                answerList.add(arr[i]);
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
