package com.likelion.Oct_28th;

/*
[Programmers] 전화번호 목록
- KR's Tip) 최악의 경우를 생각해보기
    -> 전화번호부 첫번째 요소와 마지막 요소만 접두어가 겹치게 된 상황이라면..?
    -> 그 가운데 두번째 요소부터 마지막-1요소까지는 겹치는 것이 없다면..?
- 스트링의 길이가 가장 짧은 것을 찾아서 비교
 */

import java.util.HashSet;

public class PhoneNumBook {
    public boolean solution(String[] phone_book) {
        HashSet<String> hashSet= new HashSet<>();
        String prefix = ""; // 접두어 변수 초기화
        int prefixIdx = 0; // 길이가 가장 짧은 접두어의 인덱스 변수 초기화
        for (int i = 0; i<phone_book.length; i++) {
            int phoneNumLen = phone_book[i].length(); //i번째 전화번호의 길이
            for (int j = 1; j<phone_book.length; j++) {
                if (phoneNumLen > phone_book[j].length()) {
                    phoneNumLen = phone_book[j].length();
                    prefixIdx = j;
                } else {
                    prefixIdx = i;
                }
            }
        }

        prefix = phone_book[prefixIdx]; //가장 짧은 접두어

        //phone_book 배열 요소를 hashSet에 넣기
        for ( String phoneNum : phone_book) {
            hashSet.add(phoneNum);
        }

        // hashSet 요소 순회하며 가장 짧은 접두어 인덱스가 있는지 확인
        for (String num : hashSet) {
            if ((num.indexOf(prefix)) > -1) {
                return true;
            }
        }
        return false;
    }
}