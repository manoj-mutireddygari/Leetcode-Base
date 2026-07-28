class Solution(object):
    def smallestPalindrome(self, s):
        val=list(s)
        part=len(val)//2
        val[:part] = sorted(val[:part])
        right=len(val)-1
        for i in range(part):
            val[right]=val[i]
            right -= 1
        return "".join(val)