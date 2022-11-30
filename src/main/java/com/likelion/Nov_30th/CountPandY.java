package com.likelion.Nov_30th;

import java.util.Locale;

public class CountPandY {
    boolean solution(String s) {
        boolean answer = true;
        String S_lowercase = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        for (int i = 0; i < S_lowercase.length(); i++) {
            if (S_lowercase.charAt(i) == 'p'){
                pNum ++;
            }
            if (S_lowercase.charAt(i) == 'y'){
                yNum ++;
            }
        }
        if (pNum == yNum) {
            answer = true;
        } else if (pNum == 0 && yNum ==0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
