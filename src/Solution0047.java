import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II
 * tc:O(n2)
 * sc:O(n3)
 */
public class Solution0047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        return get(nums);
    }
    public List<List<Integer>> get(int[] nums){
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if(nums.length==1) {
            List<Integer> o = new ArrayList<Integer>();
            o.add(nums[0]);
            output.add(o);
            return output;
        }
        int last = -11;
        for(int i=0;i<nums.length;i++) {
            if(last==nums[i]) {
                continue;
            }
            else {
                last=nums[i];
            }
            int[] o = new int[nums.length-1];
            int n = 0;
            for(int j=0;j<nums.length;j++){
                if(j!=i) {
                    o[n] = nums[j];
                    n++;
                }
            }
            for(List<Integer> list:get(o)) {
                list.add(last);
                output.add(list);
            }
        }
        return output;
    }
}
