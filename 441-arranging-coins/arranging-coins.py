class Solution:
    def arrangeCoins(self, n: int) -> int:
        count = 0
        i = 1
        while n>=i: 
            n = n-i 
            count = count+1
            i=i+1
        return count
