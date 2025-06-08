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
class Solution {
    boolean flag = true;
    public boolean isUnivalTree(TreeNode root) {
        helper(root,root.val);
        return flag;
        
    }
    void helper(TreeNode root,int val){
        if(root == null) return;
        helper(root.left,val);
        if(root.val != val) {
            flag = false;
            return;
        }
        helper(root.right,val);
    }
}