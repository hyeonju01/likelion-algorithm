package com.likelion.Oct_27th;

import java.util.HashMap;
import java.util.Map;

public class RacerDidNotCompleted {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }
        for ( int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }
        for (String key: memo.keySet()) {
            if (memo.get(key) == 1) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] p = new String[]{"leo", "kiki", "eden"};
        String[] c = new String[]{"eden", "kiki"};
        RacerDidNotCompleted rc = new RacerDidNotCompleted();
        System.out.println(rc.solution(p, c));
    }

}
