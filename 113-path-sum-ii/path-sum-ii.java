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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root,targetSum,new ArrayList<>(),res);
        return res;
    }
    void helper(TreeNode root,int targetSum, List<Integer> lst, List<List<Integer>> res){
        if(root == null) return;
        lst.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val) {
            res.add(new ArrayList<>(lst)); 
        }
        else {
            helper(root.left, targetSum - root.val, lst, res);
            helper(root.right, targetSum - root.val, lst, res);
        }

        lst.remove(lst.size() - 1);
    }
}