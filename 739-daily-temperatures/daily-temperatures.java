class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int i = temperatures.length - 1;
        int[] res = new int[i+1];
        while(i>=0){
            while(!stk.isEmpty() 
                && temperatures[i] >= temperatures[stk.peek()]
            ){
                stk.pop();
            }
            if(!stk.isEmpty()){
                res[i] = stk.peek() - i;
            }
            stk.push(i);
            i--;
        }
        return res;
    }
}