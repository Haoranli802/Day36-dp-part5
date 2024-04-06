# Day36-dp-part5

● 完全背包

完全背包就是物品数量无限用的01背包。那么我们遍历背包的时候就不用从后往前遍历了。从前往后遍历可以多次选取同一物品。

● 518. 零钱兑换 II 

dp[n]含义：有多少种方式可以凑成总金额n

初始化：dp[0] = 1 凑成0有一种方式

遍历顺序：先物品再正序背包

公式：dp[n] += dp[n - coins[i]]


● 377. 组合总和 Ⅳ  

dp[i]含义：有dp[i]种组合能凑成i

初始化：有一种组合能凑成dp[0];

公式：dp[i] += dp[i - nums[j]];

顺序：先背包再物品，这样能求排列

注意求组合的话不用管物品出现的顺序，那么就先物品再背包，如果求排列的话要考虑物品出现顺序，所以要先背包再物品。
