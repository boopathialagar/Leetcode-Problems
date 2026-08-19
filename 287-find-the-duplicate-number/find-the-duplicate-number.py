class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        container = set()
        for num in nums:
            if num not in container:
                container.add(num)
            else:
                return num
        return -1
        