public class Solution0944 {
    public int minDeletionSize(String[] strs) {
        int o = 0;
        int l = strs[0].length();
        int s = strs.length;
        for(int c=0;c<l;c++) {
            char ch = 'a';
            for(int r=0;r<s;r++) {
                if(ch<=strs[r].charAt(c)) ch=strs[r].charAt(c);
                else {
                    o++;
                    break;
                }
            }
        }
        return o;

    }
}
