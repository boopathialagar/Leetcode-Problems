class Solution:


    def rev(self,x):
        res = 0
        while x != 0:
            last = x % 10
            res = (res*10)+last
            x = x//10
        return res

    def reverse(self, x: int) -> int:
            if x >0:
                res = self.rev(x)
                if res < 2147483647:
                    return res
                return 0
            else:
                x = x * (-1)
                res = -1 * self.rev(x) 
                if res > -2147483648:
                    return res
                else:
                    return 0 
            