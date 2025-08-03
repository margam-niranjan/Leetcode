class Solution(object):
    def singleNumber(self, nums):
        a=set(nums)
        for i in a:
            if nums.count(i)==1:
                return i