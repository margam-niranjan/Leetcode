class MinStack {
    private Stack<Integer> stk;
    private List<Integer> lst;

    public MinStack() {
        stk = new Stack<>();
        lst = new ArrayList<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(lst.isEmpty()){
            lst.add(val);
        }
        else{
            lst.add(Math.min(lst.get(lst.size()-1),val));
        }
    }
    
    public void pop() {
        stk.pop();
        lst.remove(lst.size()-1);
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return lst.get(lst.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */