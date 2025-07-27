class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int n = temperatures.length;
        int ans[] = new int[n];
        ans[n-1] = 0;
        for(int i = n - 1; i>=0 ; i--){
            while(!stk.isEmpty() && temperatures[i] >= temperatures[stk.peek()]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                ans[i] = stk.peek() - i;
            }
            stk.push(i);
        }
        return ans;
    }
}