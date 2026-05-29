class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int max = 1;
        int[] dp = new int[nums.length];
        int[] cnt = new int[nums.length];
        int result =0;
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    // dp[i] = Math.max(dp[i],dp[j]+1);
                    dp[i]  = dp[j]+1;
                    cnt[i] = cnt[j];
                }
                else if(nums[i]>nums[j] && dp[j]+1==dp[i]){
                    cnt[i]+=cnt[j];
                }
            }
            max = Math.max(dp[i],max);
            
        }
        for(int i=0;i<n;i++){
            if(dp[i]==max)result+=cnt[i];
        }
        return result;
    }
}