package com.likelion.Nov_15th;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort1 {

    public List<Integer> merge(List<Integer> left,
                               List<Integer> mid,
                               List<Integer> right){
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);

        return answer;
    }

    public List<Integer> sort(List<Integer> arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        int pivot = arr.get(arr.size()/2);
        mid.add(pivot);
        while (arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                if ( pivot < arr.get(i)) {
                    right.add(arr.get(i));
                } else if (pivot >= arr.get(i)){
                    left.add(arr.get(i));
                } else {
                    mid.add(arr.get(i));
                }
            }
        }
        return merge(sort(left), sort(mid), sort(right));
    }

    public static void main(String[] args) {
        var arr = new int[] {20, 18, 5, 19, 5, 25, 40, 50}; //size=8
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            al.add(arr[i]);
        }

        /*
        [코드를 보는 훈련] -> 뇌를 컴파일러로 만드는 방법!!~!! *^^*
        바로 실행하지 않고 예상 출력값을 생각해보면 좋다.
        내가 생각한대로 로직이 실행되었는지 확인할 수 있기 때문이다.
         */

        QuickSort1 qs = new QuickSort1();
        qs.sort(al);
    }
}
