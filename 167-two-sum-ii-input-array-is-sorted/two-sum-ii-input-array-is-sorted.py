class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        dic = {}
        dic[numbers[0]] = 0
        for i in range(1,len(numbers)):
            comp = target - numbers[i]
            if comp in dic:
                return [dic[comp]+1,i+1]
            else:
                dic[numbers[i]] = i
        return [-1,-1]