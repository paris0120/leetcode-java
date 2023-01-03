public class Solution0124 {
    int m = -1000;
    public int maxPathSum(TreeNode root) {
        get(root);
        return m;
    }

    public int get(TreeNode root) {
        if(root == null) return 0;
        int l = get(root.left);
        int r = get(root.right);
        m = Math.max(m, l+r+root.val);
        return Math.max(0, Math.max(l, r) + root.val);
    }



  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
