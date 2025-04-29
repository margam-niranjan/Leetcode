class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[] = new int[128];
        int l=0,r=0;
        int max = 0 ;
        while(r<s.length()){
            arr[s.charAt(r)]++;
            while(arr[s.charAt(r)]>1){
                arr[s.charAt(l)]--;
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}