class Solution {
    public boolean isPowerOfTwo(int n) {
        double num = n;
        while(num>=2){
            num /= 2;
        }
        return num == 1;
    }
}