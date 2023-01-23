public class Solution0654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return c(nums, 0, nums.length-1);
    }
    public TreeNode c(int[] nums, int f, int e) {
        if(f>e) return null;
        int p  = -1;
        int m = Integer.MIN_VALUE;
        for(int i = f; i<=e; i++)
            if(nums[i]>m) {
                m = nums[i];
                p = i;
            }
        return new TreeNode(m, c(nums, f, p-1), c(nums, p+1, e));

    }
}
