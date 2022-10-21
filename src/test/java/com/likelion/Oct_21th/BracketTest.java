package com.likelion.Oct_21th;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        Bracket bracket = new Bracket();
        assertTrue(bracket.solveBracketReplace("()()"));
        assertTrue(bracket.solveBracketReplace("(())()"));
        assertFalse(bracket.solveBracketReplace(")()("));
        assertFalse(bracket.solveBracketReplace("(()("));
    }
}