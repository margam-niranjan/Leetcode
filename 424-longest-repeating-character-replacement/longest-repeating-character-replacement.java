class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,max=0,maxlen=0;
        int arr[] = new int[26];
        for(int right=0 ; right<s.length() ; right++){
            arr[s.charAt(right)-'A']++;
            max = Math.max(max,arr[s.charAt(right)-'A']);
            while((right-left+1)- max >k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}