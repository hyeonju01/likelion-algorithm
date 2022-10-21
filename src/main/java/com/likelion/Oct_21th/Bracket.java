package com.likelion.Oct_21th;

import java.util.Stack;

public class Bracket {
    public boolean solution (String s) {
        while ((s.indexOf("()")) >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean solution2 (String s) { // O(N^2)
        while (s.indexOf("()") >= 0) {
            String[] splitted = s.split("//(//)");
            s = String.join("", splitted);
        }

        return s.length() == 0;

    }

    public boolean solution3 (String s) {
        Stack<Character> st = new Stack<>(); //using java stack, O(N)
//        st.push("(");
//        st.pop();
//        System.out.println(st.empty());
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                st.push(s.charAt(i));
                System.out.println(st.size());
            } else if (')' == s.charAt(i)) {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop(); // 맨 처음 닫는 괄호가 먼저 나올 경우 pop() -> EmptyStackException 발생, 에러처리 필요
            }
        }
        return st.empty(); //.empty(), .isEmpty() 차이 알아둘 것

    }
}