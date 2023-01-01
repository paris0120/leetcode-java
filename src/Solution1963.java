public class Solution1963 {
    public int minSwaps(String s) {
        int m = 0;
        int count = 0;
        for(char c:s.toCharArray()) {
            if(c=='[') count++;
            else count--;
            if(count<0) {
                count=1;
                m++;
            }
        }
        return m;
    }
}
