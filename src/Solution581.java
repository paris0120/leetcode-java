/**
 * 581. Shortest Unsorted Continuous Subarray
 * tc: O(n)
 * sc: O(1)
 */
public class Solution581 {
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int b = nums.length, e = 0;
            if(b==0) return 0;
            int m = nums[0];
            for(int i=0; i<nums.length; i++) {
                if(nums[i]<m) {
                    e = i;
                }
                else {
                    m = nums[i];
                }
            }
            m++;
            for(int i=nums.length-1;i>=0;i--) {
                if(nums[i]>m) {
                    b = i;
                }
                else {
                    m = nums[i];
                }
            }
            return Math.max(e - b + 1,0);
        }
    }
}
