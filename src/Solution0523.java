import java.util.HashSet;

public class Solution0523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        int sum = nums[0]%k;
        boolean z = sum==0;
        s.add(sum);
        for(int i=1;i<nums.length;i++){
            sum=(sum+nums[i])%k;
            if(sum==0) return true;
            if(!s.add(sum)) {
                if(nums[i]%k!=0) return true;
                if(z) return true;
                else z = true;
            }
            else {
                z = false;
            }
        }

        return false;
    }
}
