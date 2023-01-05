import java.util.Arrays;
import java.util.HashSet;

public class Solution0720 {
    public String longestWord(String[] words) {
        HashSet<String> s = new HashSet<>();
        Arrays.sort(words, (a, b)->a.length()==b.length()?a.compareTo(b):a.length()-b.length());
        String o = "";
        int m = 0;
        for(String w:words) {
            if(w.length()<2 || s.contains(w.substring(0,w.length()-1))) {
                if(w.length()>m) {
                    m = w.length();
                    o = w;
                }
                s.add(w);
            }
        }
        return o;
    }
}
