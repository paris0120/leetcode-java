public class Solution1796 {
    public int[] minOperations(String boxes) {
        int [] o = new int[boxes.length()];
        int c = 0;
        int m = 0;
        for(int i = 0;i<boxes.length();i++) {
            o[i]+=m;
            c+=boxes.charAt(i)-'0';
            m+=c;
        }
        c = 0;
        m = 0;
        for(int i = boxes.length()-1;i>=0;i--) {
            o[i]+=m;
            c+=boxes.charAt(i)-'0';
            m+=c;
        }
        return o;
    }
}
