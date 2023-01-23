public class Solution0994 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if(val>root.val) return new TreeNode(val, root, null);
        i(root, val);
        return root;

    }

    public void i(TreeNode root, int val) {
        if(root.right==null) {
            root.right = new TreeNode(val);
        }
        else if(val>root.right.val) {
            root.right = new TreeNode(val, root.right, null);
        }
        else {
            i(root.right, val);
        }
    }
}
