/**
 * 1641. Count Sorted Vowel Strings
 * tc:O(n)
 * sc:O(1)
 */
public class Solution1641 {
    public int countVowelStrings(int n) {
        int[] c = new int[]{1,1,1,1,1};
        while(n>1) {
            for(int i=3;i>=0;i--) {
                c[i]+=c[i+1];
            }
            n--;
        }
        return c[0]+c[1]+c[2]+c[3]+c[4];
    }
}
