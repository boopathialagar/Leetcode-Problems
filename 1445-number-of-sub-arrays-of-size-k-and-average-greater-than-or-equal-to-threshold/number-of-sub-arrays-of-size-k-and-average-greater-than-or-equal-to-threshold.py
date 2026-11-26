class Solution:
    def numOfSubarrays(self, nums: list[int], k: int, threshold: int) -> int:
        l = 0
        sum = 0
        count= 0
        for r in range(len(nums)):
            sum += nums[r]
            if( r>=k-1):
                if (sum/k >= threshold ):
                    count+=1
                sum -=nums[l]
                l+=1
        return count
        