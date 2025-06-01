class MinStack {
    private Stack<Integer> stack;
    private List<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new ArrayList<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.add(val);
        } else {
            minStack.add(Math.min( minStack.get(minStack.size() - 1),val));
        }
    }

    public void pop() {
        stack.pop();
        minStack.remove(minStack.size()-1);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
};