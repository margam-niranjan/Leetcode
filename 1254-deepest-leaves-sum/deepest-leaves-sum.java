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
    int res= 0;
    public int deepestLeavesSum(TreeNode root) {
        int d = depth(root);
        sum(root,d,1);
        return res;

    }
    int depth(TreeNode root){
        if(root == null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        return Math.max(l,r) +1 ;
    }
    
    void sum(TreeNode root, int depth, int curr){
        if(root == null) return;
        if(curr == depth ) {
            res += root.val;
            return;
        }
        sum(root.right, depth, curr+1);
        sum(root.left, depth, curr+1);
        
    }
}