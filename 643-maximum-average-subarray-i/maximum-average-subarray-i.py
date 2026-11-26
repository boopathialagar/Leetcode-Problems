class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        sum =0
        m = float('-inf')
        l = 0
        for r in range(len(nums)):
            sum += nums[r]
            if r>=k-1:
                m = max(m,sum/k)
                sum -= nums[l]
                l+=1
        return m 
        
        