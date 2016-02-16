package Coin_Change;

import java.util.Arrays;

/**
 * @author yaowang_i746
 *
 */
public class Solution {
	
	/**
	 * 动态规划，
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange(int[] coins, int amount) {
        if (coins==null || coins.length==0 || amount<0) {
            return 0;
        }
        int[] dp = new int[amount+1];  // dp[0] = 0
        for (int i=1; i<=amount; ++i) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin: coins) {
                if (coin<=i && dp[i-coin]!=-1) {// current coin is not too large and there is a solution for i-coin
                    dp[i] = Math.min(dp[i], 1+dp[i-coin]);
                }
            }
            if (dp[i] == Integer.MAX_VALUE) {  // amount == i has no solution
                dp[i] = -1;
            }
        }
        return dp[amount];
    }
    
}
