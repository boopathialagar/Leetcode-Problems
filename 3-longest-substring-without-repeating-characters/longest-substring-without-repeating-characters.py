class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        count = 0
        l = 0
        sets = set()
        for r in range(len(s)):
            while(s[r] in sets):
                sets.discard(s[l])
                l+=1
            sets.add(s[r])
            count = max(count,len(sets))
        return count

        