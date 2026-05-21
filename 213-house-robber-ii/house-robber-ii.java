class Solution {
    int helper(int[] nums,int st,int end){
        int dp[] =new int[nums.length];
        for(int i=st;i<=end;i++){
            if(i==st){
                dp[st] = nums[st];
            }
            else if(i==st+1){
                dp[i] = Math.max(dp[st],nums[i]);
            }
            else{
                dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
            }
        }
        return dp[end];
    }


    public int rob(int[] nums) {
        if(nums.length ==1) return nums[0];
       int a = helper(nums,0,nums.length-2);
       int b = helper(nums,1,nums.length-1);
       return Math.max(a,b);
    }
}