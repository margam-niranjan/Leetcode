class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s.length() % 2 != 0) return false;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')stk.push(ch);
            else if(!stk.isEmpty() && match(stk.peek(),ch)) {
                stk.pop();
            }
            else return false;
        }
        return stk.isEmpty();
    }
    boolean match(char ch1, char ch2){
        if(ch1 == '(' && ch2 == ')') return true;
        if(ch1 == '{' && ch2 == '}') return true;
        if(ch1 == '[' && ch2 == ']') return true;
        return false;
    }
}