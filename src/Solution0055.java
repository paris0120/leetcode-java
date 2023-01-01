public class Solution0055 {
    public boolean canJump(int[] nums) {
        int m = 0;
        for(int i = 0;i<=m;i++) {
            m = Math.max(m, i+nums[i]);
            if(m>=nums.length-1) break;
        }
        return m>=nums.length-1;
    }
}
