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

    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        helper(root);
        return result;
    }

    private int helper(TreeNode node) {
        if (node.left == null && node.right == null) return 0;
        if (node.left == null) {
            int length = helper(node.right) + 1;
            result = Math.max(result, length);
            return length;
        }
        if (node.right == null) {
            int length = helper(node.left) + 1;
            result = Math.max(result, length);
            return length;
        }

        int left = helper(node.left);
        int right = helper(node.right);
        result = Math.max(result, left + right + 2);
        return Math.max(left, right) + 1;
    }
}