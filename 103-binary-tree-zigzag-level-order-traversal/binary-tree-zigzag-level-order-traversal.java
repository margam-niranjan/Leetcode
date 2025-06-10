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
    boolean order = true;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        helper(root,res);
        return res;
    }
    void helper(TreeNode root,List<List<Integer>> res){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i<size; i++){
                TreeNode top = q.poll();
                if(top!=null) temp.add(top.val);
                if(top.left != null) q.add(top.left);
                if(top.right != null) q.add(top.right);
            }
            if (!order) Collections.reverse(temp);
            res.add(temp);
            order = !order;

        }
    }
    
}