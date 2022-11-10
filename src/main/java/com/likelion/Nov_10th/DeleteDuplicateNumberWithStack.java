package com.likelion.Nov_10th;

import java.util.*;

// Solution 2: Stack 사용
public class DeleteDuplicateNumberWithStack {

    public int[] solution(int [] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        int[] answer = new int[st.size()];
        for (int i = st.size()-1; i >= 0; i--) {
            System.out.println(i);
            answer[i] = st.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        DeleteDuplicateNumberWithStack st = new DeleteDuplicateNumberWithStack();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(st.solution(arr)));
        // [1, 3, 0, 1]

    }
}
