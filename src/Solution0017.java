import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 */
public class Solution0017 {
    String[] s = new String[]{"abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        else return getString("", digits);

    }

    public List<String> getString(String pre, String s) {
        List<String> output = new ArrayList<String>();
        String next = s.substring(1);
        for(char c:this.s[s.charAt(0)-'2'].toCharArray()) {
            if(next.length()==0) {
                output.add(pre+c);
            }
            else {
                output.addAll(getString(pre+c, next));
            }
        }
        return output;
    }
}
