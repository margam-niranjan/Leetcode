class Solution {
    public int fib(int n) {
        if(n<=1) return n; 
        int[] dp = new int[n+1];
        int a = 0;
        int b = 1;

        for(int i=2;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}