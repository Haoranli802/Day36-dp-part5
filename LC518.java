class Solution {
    public int change(int amount, int[] coins) {
        /**
        dp[n]含义：有多少种方式可以凑成总金额n
        初始化：dp[0] = 1 凑成0有一种方式
        遍历顺序：先物品再正序背包
        公式：dp[n] += dp[n - coins[i]]

        O(N * M), O(M)
         */
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++){
            for(int j = coins[i]; j <= amount; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
