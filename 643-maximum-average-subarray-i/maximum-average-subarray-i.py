class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        sum =0
        for i in range(k):
            sum += nums[i]
        l = 0
        r = k-1
        m = float('-inf')
        while r < len(nums):
            m = max(m,sum/k)
            sum -= nums[l]
            l+=1
            r+=1
            if(r < len(nums)):
                sum += nums[r]
        return m
        
        