package com.likelion;

import java.util.HashSet;
import java.util.Set;

/*
아이디어

 */
public class Poketmon {
    public int solution(int[] nums) {
        Set<Integer> pokemon = new HashSet<>(); // pokemon: 포켓몬 종류 도감(?)
        for (int i = 0; i < nums.length; i++) {
            pokemon.add(nums[i]); // pokemon set에 포켓몬 종류를 중복 없이 입력한다.
        }
        int pick = nums.length / 2; // 데려갈 수 있는 포켓몬 수 [3,1,2,3] -> 2
        if (pick < pokemon.size()) {
            return pick;
        }
        int answer = pokemon.size();

        return answer;
    }

    public static void main(String[] args) {


    }
}
