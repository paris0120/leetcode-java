import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution0131 {
    public List<List<String>> partition(String s) {
        return g(s, new ArrayList<>(), 0);
    }

    public List<List<String>> g(String s, List<String> q, int i) {
        List<List<String>> o = new LinkedList<>();
        for(int j=i+1;j<=s.length();j++) {
            String sub = s.substring(i,j);
            if(b(sub)) {
                q.add(sub);
                if(j==s.length()) {
                    o.add(new ArrayList<>(q));
                }
                else {
                    o.addAll(g(s, q, j));
                }s
                q.remove(q.size()-1);
            }
        }
        return o;
    }

    public boolean b(String s) {
        int l = s.length();
        for(int i = 0;i<s.length()/2;i++) if(s.charAt(i)!=s.charAt(l-i-1)) return false;
        return true;
    }
}
