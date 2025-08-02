class Solution(object):
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        pref = strs[0]
        prefLen = len(pref)
        for i in range(1,len(strs)):
            s = strs[i]
            while prefLen > len(s) or  s[0:prefLen] != pref:
                prefLen = prefLen - 1
                if not pref:
                    return ""
                pref = pref[0:prefLen]
        return pref
        # java loo cheppochaa???? expain chesta every term java looo okay aaa??? vachaaka cheppu
        # cheppu kani aag 