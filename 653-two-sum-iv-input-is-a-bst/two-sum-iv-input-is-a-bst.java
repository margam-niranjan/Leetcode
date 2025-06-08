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
    boolean res = false;
    public boolean findTarget(TreeNode root, int k) {
        helper(root,root,k);
        return res;
    }
    void helper(TreeNode root,TreeNode node, int k){
        if(root == null) return;
        helper2(node, root, k - root.val);
        helper(root.left,node,k);
        helper(root.right,node,k);
    }
    void helper2(TreeNode root,TreeNode exclude, int k){
        if(root == null) return ;
        if(k==root.val && root != exclude) res = true;
        if(k>root.val) helper2(root.right,exclude,k);
        if(k<root.val) helper2(root.left,exclude,k);
    }
}