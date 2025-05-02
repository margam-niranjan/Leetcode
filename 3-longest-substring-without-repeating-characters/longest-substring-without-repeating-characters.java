class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int l = 0 , max=0;
        for(int r = 0;r<s.length();r++){
            char ch = s.charAt(r);
            if(arr[ch]>=l){
                l = arr[ch]+1;
            }
            arr[ch] = r;
            int len = r-l+1;
            max = Math.max(max,len);
        }
        return max;
    }
}
