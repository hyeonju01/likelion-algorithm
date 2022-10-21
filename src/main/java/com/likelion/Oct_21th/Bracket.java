package com.likelion.Oct_21th;

public class Bracket {
    public boolean solveBracketReplace (String s) {
        while ((s.indexOf("()")) >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }
}
