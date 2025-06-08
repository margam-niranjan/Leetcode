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
    int min;
    long secMin=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        min = root.val;
        dfs(root);
        return secMin == Long.MAX_VALUE ? -1 : (int)secMin;
    }
    void dfs(TreeNode root){
        if(root == null)return;
        if (root.val > min && root.val < secMin) 
            secMin = root.val; 
        else if(root.val == min){
            dfs(root.left);
            dfs(root.right);
        }
    }
}