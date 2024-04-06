class Solution {
    public int combinationSum4(int[] nums, int target) {
        /**
        dp[i]含义：有dp[i]种组合能凑成i
        初始化：有一种组合能凑成dp[0];
        公式：dp[i] += dp[i - nums[j]];
        顺序：先背包再物品，这样能求排列

        O(M * N), O(M)
         */
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 0; i <= target; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[j] <= i){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
