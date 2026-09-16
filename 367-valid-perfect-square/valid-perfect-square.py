class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        i = 1
        r= num
        while(i<=r):
            mid = i+(r-i)//2
            square = mid*mid
            if square == num:
                return True
            if square > num:
                r = mid-1
            else:
                i = mid+1
        return False