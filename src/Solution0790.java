public class Solution0790 {
    public int numTilings(int n) {
        long M = 1000000007;
        long carry = 0;
        long[] dp = new long[n];
        for (int i = 0; i < n; ++i) {
            for(int c = 1;c<3;c++) {
                int pos = i-c;
                if(pos==-1) {
                    dp[i]+=1;
                    break;
                }
                else{
                    dp[i]+=dp[pos];
                }
            }
            if(i>2){
                carry+=dp[i-3];
                dp[i]+=2*carry;
            }
            if(i>=2){
                dp[i]+=2;
            }
            dp[i] = dp[i] % M;
            carry = carry % M;
        }
        return (int) dp[n-1];
    }
}
