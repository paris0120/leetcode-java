import java.util.LinkedList;
import java.util.List;

public class Solution0093 {
    public List<String> restoreIpAddresses(String s) {
        return get(s, "", 0, 0);
    }

    public List<String> get(String s, String q, int i, int p) {
        List<String> o = new LinkedList<>();
        if(p==3) {
            String sub = s.substring(i);
            if(v(sub)) o.add(q+sub);
            return o;
        }
        for(int j = 1;j<4;j++) {
            if(i+j>s.length()) break;
            String sub = s.substring(i, i+j);
            if(v(sub)) o.addAll(get(s, q+sub+".", i+j, p+1));
        }
        return o;
    }

    boolean v(String s) {
        if(s.length()==0) return false;
        if(s.length()>3) return false;
        if(s.equals("0")) return true;
        if(s.charAt(0)=='0') return false;
        if(Integer.parseInt(s)<256) return true;
        return false;

    }
}
