/**
 * 5. Longest Palindromic Substring
 * tc: O(n^2)
 * sc: O(n^2)
 */
public class Solution0005 {
    public String longestPalindrome(String s) {
        boolean[][] l = new boolean[s.length()][s.length()];
        int m = 1;
        int b = 0;
        for(int i = 1;i < s.length(); i++) {
            for(int j = 0;j < i-1; j++) {
                if(s.charAt(j) == s.charAt(i)) {
                    if(l[i-1][j+1]) {
                        l[i][j] = true;
                        if(i-j+1>m) {
                            m = i-j+1;
                            b = j;
                        }
                    }
                }
            }
            if(s.charAt(i-1) == s.charAt(i)) {
                l[i][i-1] = true;
                if(m<2) {
                    m = 2;
                    b = i-1;
                }
            }
            l[i][i] = true;
        }


        return s.substring(b, b+m);

    }
}
