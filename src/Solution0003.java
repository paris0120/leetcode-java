import java.util.HashSet;

/**
 * 3. Longest Substring Without Repeating Characters
 * tc: O(n)
 * sc: O(1)
 */
public class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> cs = new HashSet<>();
        int output = 0;
        int i = 0;
        for(char c:s.toCharArray()) {
            while(cs.contains(c)) {
                cs.remove(s.charAt(i));
                i++;
            }
            cs.add(c);
            output = Math.max(cs.size(), output);
        }
        return output;
    }
}
