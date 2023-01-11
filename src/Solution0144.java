import java.util.LinkedList;
import java.util.List;

public class Solution0144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> o = new LinkedList<>();
        l(root, o);
        return o;
    }

    public void l(TreeNode root, List<Integer> o) {
        if(root!=null) {
            o.add(root.val);
            l(root.left, o);
            l(root.right, o);
        }
    }
}
