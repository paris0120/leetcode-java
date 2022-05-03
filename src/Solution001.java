import java.util.Arrays;

/**
 * 1. Two Sum
 * tc: O(log(n)n)
 * sc: O(n)
 */
public class Solution001 {
    public int[] twoSum(int[] nums, int target) {
        int[] s = Arrays.copyOf(nums, nums.length);
        Arrays.sort(s);
        int b = 0, e = nums.length-1;
        while(b+1<e) {
            if(s[b] + s[e] == target) break;
            if(s[b] + s[e] > target) e--;
            else b++;
        }
        int[] output = new int[]{-1, -1};
        for(int i = 0; i<s.length; i++) {
            if(nums[i] == s[b] && output[0]<0) {
                output[0] = i;
            }
            else if(nums[i] == s[e]) {
                output[1] = i;
            }
        }
        return output;
    }
}
