public class Solution0129 {
    public int sumNumbers(TreeNode root) {
        return add(root, 0);
    }

    public int add(TreeNode root, int v) {
        if(root==null) return 0;
        v=v*10+root.val;
        return Math.max(v,add(root.left, v) + add(root.right, v));
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

