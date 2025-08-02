class Solution(object):
    def merge(self, nums1, m, nums2, n):
        p = (m - 1) 
        q = (n - 1) 
        r = m+n -1
        while(q>=0):
            if(p>=0 and nums1[p] > nums2[q]):
                nums1[r] = nums1[p]
                r = r-1
                p = p-1
            else:
                nums1[r] = nums2[q]
                r = r-1
                q = q-1
        