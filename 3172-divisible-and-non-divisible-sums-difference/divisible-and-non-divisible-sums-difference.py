class Solution(object):
    def differenceOfSums(self, n, m):
        lst1=[]
        lst2=[]
        for i in range(1,n+1):
            if i%m != 0:
                lst1.append(i)
            else:
                lst2.append(i)
        return sum(lst1) - sum(lst2)
        
            
                
            
            
            
    