public class Solution0006 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        numRows--;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<=numRows;i++) {
            int n = i;
            while(n<s.length()) {
                sb.append(s.charAt(n));
                n+=2*numRows;
                if(i>0 && i < numRows && n-2*i<s.length()) sb.append(s.charAt(n-2*i));
            }

        }
        return sb.toString();
    }
}
