class Solution(object):
    def isValid(self, s):
        lst=[]
        if len(s)%2==0:
            for i in range(len(s)):
                if s[i]=="[" or s[i]=="{" or s[i]=="(" :
                    lst.append(s[i])
                else:
                    if lst and self.check(lst[-1], s[i]):
                        lst.pop() 
                    else:
                        return False
        else:
            return False
        if not lst:
            return True
        else:
            return False
    def check(self,ch1,ch2):
        return (ch1 == "(" and ch2 == ")") or (ch1 == "{" and ch2 == "}") or (ch1 == "[" and ch2 == ']')