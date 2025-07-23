class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        boolean[] isPrime = sieve(n);
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) sumA += nums[i];
            else sumB += nums[i];
        }
        return Math.abs(sumA - sumB);
    }

    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];
        if (n > 2) isPrime[2] = true;
        for (int i = 3; i < n; i += 2) isPrime[i] = true;
        if (n > 2) isPrime[2] = true;
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i * 2) {
                    isPrime[j] = false;
                }
            }
        }
        isPrime[0] = false;
        if (n > 1) isPrime[1] = false;
        return isPrime;
    }
}