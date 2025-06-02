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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        bfs(root,new ArrayList<>(), res);
        return res;
    }
    public Queue<TreeNode> q = new LinkedList<>();
    void bfs(TreeNode root, List<Integer> lst,List<List<Integer>> res){
        if(root == null) {
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode top = q.poll();
            if(top == null){
                res.add(lst);
                lst = new ArrayList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
            else{
                lst.add(top.val);
                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);
                
            }
            
        }
    }
}