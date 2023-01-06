public class Solution0012 {
    char[] c = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M', 'M'};
    public String intToRoman(int num) {
        String o = "";
        int i = 0;
        while(num>0) {
            o = s(num%10, i)+o;
            i++;
            num/=10;
        }
        return o;

    }
    public String s(int num, int i) {
        if(num==4) return "" + c[i*2] + c[i*2+1];
        if(num==9) return "" + c[i*2] + c[i*2+2];
        String o = "";
        if(num>=5) {
            o+=c[i*2+1];
            num%=5;
        }
        while(num>0) {
            num--;
            o+=c[i*2];
        }
        return o;
    }
}
