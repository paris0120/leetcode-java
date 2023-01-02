public class Solution2414 {
    public int longestContinuousSubstring(String s) {
        int m = 1;
        int cl = 1;
        char l = s.charAt(0);
        for(char c:s.toCharArray()) {
            if(c-l==1) {
                cl++;
                m = m>cl?m:cl;
            }
            else {
                cl = 1;
            }
            l = c;
        }
        return m;
    }
}
