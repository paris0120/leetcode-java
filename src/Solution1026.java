public class Solution1026 {

    int o = 0;
    public int maxAncestorDiff(TreeNode root) {
        min(root);
        return o;
    }

    public int[] min(TreeNode root) {
        int max = root.val;
        int min = root.val;
        if(root.left!=null) {
            int[] m =min(root.left);
            if(max<m[0]) max = m[0];
            if(min>m[1]) min = m[1];
        }
        if(root.right!=null) {
            int[] m =min(root.right);
            if(max<m[0]) max = m[0];
            if(min>m[1]) min = m[1];
        }
        o = Math.max(o, root.val-min);
        o = Math.max(o, max - root.val);
        return new int[]{max, min};
    }

}
