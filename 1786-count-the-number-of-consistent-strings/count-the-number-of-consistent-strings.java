class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        for(char ch : allowed.toCharArray()){
            arr[ch-'a'] = true;
        }
        int cnt = 0;
        for(String str : words){
            boolean consistent = true;
            for (char ch : str.toCharArray()) {
                if (!arr[ch - 'a']) {
                    consistent = false; 
                    break;
                }
            }
            if (consistent) cnt++;
        }
        return cnt;
    }
}