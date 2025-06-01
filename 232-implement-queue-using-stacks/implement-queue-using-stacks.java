class MyQueue {
    private Stack<Integer> stk1;
    private Stack<Integer> stk2;
    
    public MyQueue() {
        stk1 = new Stack<Integer>();
        stk2 = new Stack<Integer>();
    }
    
    public void push(int x) { 
        stk1.push(x);
    }
    
    public int pop() {
        shift(stk1,stk2);
        return stk2.pop();
        
    }
    
    public int peek() {
        shift(stk1,stk2);
        return stk2.peek();        
    }
    
    public boolean empty() {
        return (stk1.isEmpty() && stk2.isEmpty());
    }
    public void shift(Stack<Integer> stk1, Stack<Integer> stk2){
        if (stk2.isEmpty()) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */