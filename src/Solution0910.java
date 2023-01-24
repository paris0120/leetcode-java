import java.util.Arrays;

public class Solution0910 {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int h = nums[nums.length-1]-nums[0];
        int t = nums[nums.length-1] - k;
        int b = nums[0] + k;
        for(int i = 1;i<nums.length;i++) {
            int max = Math.max(nums[i-1] + k, t);
            int min = Math.min(nums[i] - k, b);
            h = Math.min(h, max-min);
        }
        return h;
    }
}
