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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        helper1(root,lst);
        Collections.sort(lst);
        helper2(root,lst);
    }
    void helper1(TreeNode root, ArrayList<Integer> lst){
        if(root == null) return;
        helper1(root.left,lst);
        lst.add(root.val);
        helper1(root.right,lst);        
    }
    int i = 0;
    void helper2(TreeNode root, ArrayList<Integer> lst){
        if(root == null) return;
        helper2(root.left,lst);
        root.val = lst.get(i++);
        helper2(root.right,lst);        
    }

}