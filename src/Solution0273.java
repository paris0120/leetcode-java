public class Solution0273 {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        String[] t = new String[]{"Thousand", "Million", "Billion", "Trillion"};
        String[] n = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] ten = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        StringBuilder sb = new StringBuilder();
        for(int i = 3;i>=0;i--) {
            int p = (int)Math.pow(1000, i);
            int n3 = num/p;
            if(n3==0) continue;
            num%=p;
            if(n3>=100) {
                sb.append(" ");
                sb.append(n[n3/100-1]);
                sb.append(" Hundred");
                n3%=100;
            }
            if(n3>=20) {
                sb.append(" ");
                sb.append(ten[n3/10-2]);
                n3%=10;
            }
            if(n3>0) {
                sb.append(" ");
                sb.append(n[n3-1]);
            }
            if(i>0) {
                sb.append(" ");
                sb.append(t[i-1]);
            }
        }
        return sb.toString().substring(1);
    }
}
