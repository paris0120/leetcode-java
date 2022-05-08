/**
 * 7. Reverse Integer
 * tc:O(n)
 * sc:O(1)
 */
public class Solution0007 {
    public int reverse(int x) {
        int m,r,o = 0;
        if(x>0) {
            m = Integer.MAX_VALUE/10;
            r = Integer.MAX_VALUE%10;
            while(x>0) {
                if(o>m || (x==m && x>r)) return 0;
                o=o*10+x%10;
                x/=10;
            }
        }
        else {
            m = Integer.MIN_VALUE/10;
            r = Integer.MIN_VALUE%10;
            while(x<0) {

                if(o<m || (x==m && x<r)) return 0;
                o=o*10+x%10;
                x/=10;
            }

        }
        return o;

    }
}
