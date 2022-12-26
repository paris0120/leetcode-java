public class Solution0009 {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0 || x%10==0) return false;
        int y = 0;
        while(x>y) {
            y*=10;
            y+=x%10;
            x/=10;

        }
        if(x==y || (int)y/10==x) return true;
        return false;
    }
}
