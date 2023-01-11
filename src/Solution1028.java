public class Solution1028 {
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
    int p = 0;
    int depth = 0;
    int num = 0;
    String traversal;
    public TreeNode recoverFromPreorder(String traversal) {
        this.traversal = traversal;
        read();
        TreeNode o = new TreeNode(num);
        read();
        add(o, 1);
        return o;
    }

    public void add(TreeNode t, int d) {

        for(int i =0;i<2;i++) {
            if(depth == d) {
                TreeNode o = new TreeNode(num);
                if(i==0) t.left = o;
                else t.right = o;
                read();
                add(o, d+1);

            }
        }

    }

    public void read(){
        StringBuilder sb = new StringBuilder();
        depth = 0;
        while(p<traversal.length() && traversal.charAt(p) == '-') {
            depth++; p++;
        }
        while(p<traversal.length() && traversal.charAt(p)!='-') {
            sb.append(traversal.charAt(p));
            p++;
        }
        if(sb.length()>0) num = Integer.parseInt(sb.toString());
    }
}
