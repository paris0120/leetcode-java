public class Solution0010 {

    public boolean isMatch(String s, String p) {
        boolean[][] table = new boolean[p.length()+1][s.length()+1];
        if(p.length()>1 && p.charAt(1)== '*') {
            table[0][0] = true;
            table[2][0] = true;

        }
        if(s.charAt(0)== p.charAt(0) || p.charAt(0) == '.') {
            table[0][0] = true;
        }
        for(int ip=0;ip<p.length();ip++) {
            for(int is=-1;is<s.length();is++) {
                if(is<0) {
                    if(p.charAt(ip) == '*') {
                        if(table[ip-1][0]) {
                            table[ip+1][0] = true;
                        }
                    }
                    continue;
                }
                if(p.charAt(ip) == s.charAt(is) || p.charAt(ip) == '.' ) {
                    if(table[ip][is]) {
                        table[ip+1][is+1] = true;
                        continue;
                    }
                }
                if(p.charAt(ip) == '*') {
                    if(p.charAt(ip-1)==s.charAt(is) || p.charAt(ip-1)=='.') {
                        if(table[ip+1][is]) {
                            table[ip+1][is+1] = true;
                            continue;
                        }
                    }
                    if(ip>0 && table[ip-1][is+1]) {
                        table[ip+1][is+1] = true;
                        continue;
                    }
                }
            }
        }
        return table[p.length()][s.length()];

    }
}
