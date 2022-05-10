import java.util.Arrays;

/**
 * 1679. Max Number of K-Sum Pairs
 * tc:O(log(n)n)
 * sc:O(n)
 */
public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        int i = 0;
        Arrays.sort(nums);
        int b = 0, e = nums.length - 1;
        while(b<e) {
            if(nums[b]+nums[e]>k) e--;
            else if (nums[b]+nums[e]<k) b++;
            else {
                b++;
                e--;
                i++;
            }
        }
        return i;
    }
}
