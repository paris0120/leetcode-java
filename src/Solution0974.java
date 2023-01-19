public class Solution0974 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] ks = new int[k];
        int c = 0;
        for(int n:nums) {
            c+=n;
            c%=k;
            if(c<0) c+=k;
            ks[c]++;
        }
        int o = ks[0];
        for(int kk:ks) o+=kk*(kk-1)/2;
        return o;
    }
}
