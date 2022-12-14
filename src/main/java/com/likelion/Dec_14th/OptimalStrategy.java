package com.likelion.Dec_14th;

import java.util.Arrays;

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        int[][] dp = new int[coins.length][coins.length];

        int i = 0;
        for (int j = 0; j < coins.length; j++) {
            if (j == 0) {
                dp[i][j] = coins[j];
            } else {
                dp[i][j] = dp[i][j-1] + coins[j];
            }
        }

//        dp[i][0] = coins[0];
//        dp[i][1] = dp[i][0] + coins[1];
//        dp[i][2] = dp[i][1] + coins[2];
//        dp[i][3] = dp[i][2] + coins[3];

        System.out.println(Arrays.toString(dp[i]));


    }
}
