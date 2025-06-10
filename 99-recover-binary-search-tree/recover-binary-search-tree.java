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
    TreeNode prev,next,first;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        inOrder(root);
        int temp = first.val;
        first.val = next.val;
        next.val = temp;
    }
    void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(prev != null && root.val < prev.val){
            if(first == null) first = prev;
            next = root;
        }
        prev = root;
        inOrder(root.right);
    }
}