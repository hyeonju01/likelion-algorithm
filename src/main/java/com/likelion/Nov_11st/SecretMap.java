package com.likelion.Nov_11st;

/*
[kakao] 비밀 지도
https://school.programmers.co.kr/learn/courses/30/lessons/17681

[idea]
1. 정수 배열로 주어진 arr1, arr2를 이진수 배열로 변환한다.
2. 두 배열의 동일한 인덱스에 있는 이진수끼리 더한 answer 배열을 구한다.
3. answer 배열의 이진수에 따라 숫자가 1이면 #을, 0이면 공백을 출력하는 secretMap 배열을 반환한다.
*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SecretMap {

    String getBinaryString(int n) {
        String answer = " ";
        while (n > 0) {
            answer = answer + (n % 2);
            n = n / 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        String binaryNum = Integer.toBinaryString(9);
        System.out.println("java 구현체로 만든 9의 이진수는: " + binaryNum);
        SecretMap sm = new SecretMap();
        System.out.println("이진수 구하는 메소드로 만든 9의 이진수는: " + sm.getBinaryString(9));
    }
}
