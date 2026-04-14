class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        int index = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!q.isEmpty() &&  i-k == q.peekFirst()) q.pollFirst();
            while(!q.isEmpty() && nums[i]>nums[q.peekLast()]) q.pollLast();
            q.offerLast(i);
            if(i>=k-1) result[index++] = nums[q.peekFirst()];
        }
        return result;
    }
}