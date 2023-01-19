import java.util.LinkedList;
import java.util.List;

public class Solution1161 {
    public int maxLevelSum(TreeNode root) {
        List<TreeNode> l = new LinkedList<>();
        l.add(root);
        int max = Integer.MIN_VALUE;
        int i = 0;
        int o = 0;
        while(l.size()>0) {
            i++;
            List<TreeNode> t = new LinkedList<>();
            int c = 0;
            for(TreeNode n:l) {
                c+=n.val;
                if(n.left!=null) t.add(n.left);
                if(n.right!=null) t.add(n.right);
            }
            if(c>max) {
                max = c;
                o = i;
            }
            l = t;
        }
        return o;
    }
}
