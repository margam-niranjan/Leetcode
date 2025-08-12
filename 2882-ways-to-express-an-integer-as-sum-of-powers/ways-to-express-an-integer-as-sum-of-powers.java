class Solution {
    final int MOD = 1_000_000_007;
    long[][] dp;

    public int numberOfWays(int n, int x) {
        dp = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int) f(n, 1, x);
    }

    private long f(int n, int num, int x) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        long power = (long) Math.pow(num, x);
        if (power > n) return 0;

        if (dp[n][num] != -1) return dp[n][num];

        long pick = f(n - (int) power, num + 1, x);
        long skip = f(n, num + 1, x);

        return dp[n][num] = (pick % MOD + skip % MOD) % MOD;
    }
}