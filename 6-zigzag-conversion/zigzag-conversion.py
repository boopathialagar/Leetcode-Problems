class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        arr = ["" for _ in range(numRows)]
        
        curRow = 0
        direction = 1

        for i in range(len(s)):
            arr[curRow]+=s[i]
            if direction == -1:
                curRow -=1
            else:
                curRow +=1
            if curRow == numRows-1:
                direction = -1
            if curRow == 0:
                direction = 1
        print(arr)
        res = ""
        for s in arr:
            res+=s
        return res