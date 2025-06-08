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
    int res = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return res;
    }
    int sum(TreeNode root){
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        int abs = Math.abs(leftSum - rightSum);
        res += abs;
        return root.val + leftSum + rightSum;
    }
}