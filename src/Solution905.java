/**
 * Sort Array By Parity
 */
public class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j) {
            boolean ir = nums[i]%2 == 1;
            boolean jr = nums[j]%2 == 0;
            if(ir && jr) {
                int r = nums[i];
                nums[i] = nums[j];
                nums[j] = r;
            }
            if(!ir) i++;
            if(!jr) j--;
        }
        return nums;
    }
}
