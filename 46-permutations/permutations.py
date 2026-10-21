class Solution:
    def backtrack(self,nums,res,temp):
        if len(nums) == len(temp):
            res.append(temp.copy())
        for i in nums:
            if i not in temp:
                temp.append(i)
                self.backtrack(nums,res,temp)
                temp.pop()


    def permute(self, nums: list[int]) -> list[list[int]]:
        res = []
        self.backtrack(nums,res,[])
        return res