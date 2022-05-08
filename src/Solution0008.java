/**
 * 8. String to Integer (atoi)
 * tc: O(n)
 * sc: O(1)
 */
public class Solution0008 {
    public int myAtoi(String s) {
        int m = -Integer.MAX_VALUE/10, r=Integer.MAX_VALUE%10, o=0, z = (int)'0';
        boolean pos = true;
        boolean start = false;

        for(char c:s.toCharArray()) {
            switch(c) {
                case ' ':
                    if(start){
                        if(pos) return -o;
                        else return o;
                    }
                    break;
                case '+':

                    if(!start) {
                        start = true;
                    }
                    else {
                        if(pos) return -o;
                        else return o;
                    }
                    break;
                case '-':
                    if(!start) {
                        start = true;
                        pos = false;
                        r=-(Integer.MIN_VALUE%10);
                    }
                    else  {
                        if(pos) return -o;
                        else return o;
                    }
                    break;
                default:
                    start = true;
                    int n = (int)c - z;
                    if(n>=0 && n<=9)
                        if(o<m || (o==m && n>r)) {
                            if(pos) return Integer.MAX_VALUE;
                            else return Integer.MIN_VALUE;
                        }
                        else o=o*10-n;
                    else
                    if(pos) return -o;
                    else return o;

            }
        }
        if(pos) return -o;
        else return o;
    }
}