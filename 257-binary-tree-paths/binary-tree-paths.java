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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        dfs(root,lst,new StringBuilder());
        return lst;
    }
    void dfs(TreeNode root, List<String> res, StringBuilder sb){
        if(root == null) return;
        int len = sb.length();
        sb.append(root.val);

        if(root.left == null && root.right == null){
            res.add(sb.toString());
        }
        else{
            sb.append("->");
            dfs(root.left,res,sb);
            dfs(root.right,res,sb);
        }
        sb.setLength(len);
        
    }
}