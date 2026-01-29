class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, max = 0, maxLen = 0;
        int[] arr = new int[26];
        for(int i = 0 ; i< s.length(); i++){
            int ch = s.charAt(i) - 'A';
            arr[ch]++;
            max = Math.max(max, arr[ch]);
            while((i - left + 1) - max > k){
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, i-left+1);
        }
        return maxLen;
    }
}