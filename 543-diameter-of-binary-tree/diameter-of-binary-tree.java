class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diameter;
    }

    private TreeInfo helper(TreeNode root) {
        if (root == null) return new TreeInfo(0, 0);

        TreeInfo left = helper(root.left);
        TreeInfo right = helper(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int dia = Math.max(Math.max(left.diameter, right.diameter), left.height + right.height);

        return new TreeInfo(height, dia);
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
}
