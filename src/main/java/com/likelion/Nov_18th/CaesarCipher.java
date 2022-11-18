package com.likelion.Nov_18th;

/*
AB, 1
A(65)~Z(90)
a(97)~z(122)
AB -> {65, 66}
+1
{66, 67} -> ""+B+C
 */

import java.util.Arrays;

public class CaesarCipher {
    public String solution(String s, int n) { // s= "AB"
        String answer = "";

        // s 길이 배열 선언
        int [] splitted = new int[s.length()];

        // 배열에 s의 글자 하나씩 아스키 코드로 변환하여 넣기
        for (int i = 0; i < s.length(); i++) {
            // 나머지가 25이면
            if (s.charAt(i) % 65 == 25) {
                splitted[i] = 65 + n - 1;
            } else if (s.charAt(i) % 97 == 25) {
                splitted[i] = 97 + n - 1;
            } else if (s.charAt(i) == 32) {
                splitted[i] = s.charAt(i);
            }else
                splitted[i] = (int)s.charAt(i) + n; // 공백은 그냥 두기
        }
        for (int i = 0; i < splitted.length; i++) {
            answer = answer + (char) (splitted[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher cc = new CaesarCipher();
        String answer = cc.solution("a B z", 1);
        System.out.println(answer);
    }
}