package com.likelion.Nov_28th;

public class AlphabetCombination {
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print(alphabet.charAt(i));
                System.out.print(alphabet.charAt(j));
                System.out.println();
            }
        }
    }
}
