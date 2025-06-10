class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean order = true; 
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode top = q.poll();
                temp.add(top.val);
                if (top.left != null) q.add(top.left);
                if (top.right != null) q.add(top.right);
            }
            if (!order) Collections.reverse(temp); 
            res.add(temp);
            order = !order;
        }
        return res;
    }
}