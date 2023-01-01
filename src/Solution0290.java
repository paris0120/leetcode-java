import java.util.HashMap;

public class Solution0290 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> m = new HashMap<>();
        boolean[] b= new boolean[26];
        int i = 0;
        for(String p:s.split(" ")) {
            if(i>=pattern.length()) return false;
            if(m.containsKey(p)) {
                if(m.get(p).charValue() != (pattern.charAt(i))) return false;
            }
            else {
                if(b[pattern.charAt(i)-'a']) return false;
                b[pattern.charAt(i)-'a'] = true;
                m.put(p, pattern.charAt(i));
            }
            i++;
        }
        return i == pattern.length();

    }
}
