class Solution {
    public int maxFreqSum(String s) {
        int vow = 0, con = 0;
        int arr[] = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        for(int i = 0 ; i<26 ; i++){
            if(isVowel((char)(i+'a'))){
                vow = Math.max(vow, arr[i]);
            }
            else{
                con = Math.max(con, arr[i]);
            }
        }
        return vow + con;
    }
    boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}