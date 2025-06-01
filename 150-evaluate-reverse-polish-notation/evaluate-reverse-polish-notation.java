class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String ch : tokens){
           if(ch.equals("*")) stk.push(stk.pop() * stk.pop());
           else if(ch.equals("+")) stk.push(stk.pop() + stk.pop());
           else if(ch.equals("/")) {
            int second = stk.pop();
            int first = stk.pop();
            stk.push(first / second);
           }
           else if(ch.equals("-")) {
            int second = stk.pop();
            int first = stk.pop();
            stk.push(first - second);
           }
           else{
            stk.push(Integer.parseInt(ch));
           }
        }
        return stk.peek();
    }
}