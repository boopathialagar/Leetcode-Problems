class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] =Math.max(dp[i],dp[j] + 1);
                }
            }
        }
        int maxValue = 0;
        for (int v : dp) {
            maxValue = Math.max(maxValue, v);
        }
        return maxValue + 1;
    }
}