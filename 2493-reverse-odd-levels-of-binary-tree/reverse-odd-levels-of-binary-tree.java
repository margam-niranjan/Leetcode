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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left,root.right,1);
        return root;
    }
    void helper(TreeNode left, TreeNode right, int n){
        if(left == null || right == null) return;
        if(n%2==1)swap(left,right);
        helper(left.left, right.right, n + 1);
        helper(left.right, right.left, n + 1);
    }
    void swap(TreeNode left, TreeNode right){
        int l = right.val;
        right.val = left.val;
        left.val = l;
    }
}