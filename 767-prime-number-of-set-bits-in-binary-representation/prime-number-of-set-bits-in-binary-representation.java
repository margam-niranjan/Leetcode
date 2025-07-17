class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int i = left; i<= right; i++){
            if(isPrime(Integer.bitCount(i))) count++;
        }
        return count;
    }
    boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2 ; i*i <= n; i++){
            if(n % i ==0)return false;
        }
        return true;
    }

}