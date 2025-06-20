/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Stack<TreeNode> stk;
    public BSTIterator(TreeNode root) {
        stk = new Stack<>();
        TreeNode curr = root;
        while(curr != null){
            stk.push(curr);
            if(curr.left != null) curr = curr.left;
            else break;
        } 
        
    }
    
    public int next() {
        TreeNode node = stk.pop();
        if (node.right != null) {
            pushLeft(node.right); 
        }
        return node.val;
    }
    void pushLeft(TreeNode node) {
        while (node != null) {
            stk.push(node);
            node = node.left;
        }
    }
    
    public boolean hasNext() {        
        return !stk.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */