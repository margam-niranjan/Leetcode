class Solution {
    public int minFlips(String target) {
        int n = target.length();
        int i = 0;
        int count = 0;
        while(i<n){
            while(i<n && target.charAt(i) == '0'){
                i++;
            }
            int c = 0;
            while(i<n && target.charAt(i) == '1'){
                i++;
                c++;
            }
            if(c>0){
                count ++;
            }
        }
        if(target.charAt(n-1) == '1') return 2 * count - 1;
        return 2 * count;
    }
}