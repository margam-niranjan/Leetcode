class Solution(object):
    def isPalindrome(self, x):
        y=0
        c=x
        while(x>0):
            digit=x%10
            y=y*10 + digit
            x=x//10
        if(c==y):
            return True
        else:
            return False
        