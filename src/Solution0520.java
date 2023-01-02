public class Solution0520 {
    public boolean detectCapitalUse(String word) {

        boolean allc = true;
        boolean alll = true;
        for(int i = 0;i<word.length();i++) {
            if(word.charAt(i)>='a') allc = false;
            else if(i>0) alll = false;
            if(allc || alll) continue;
            else break;
        }
        return allc || alll;

    }
}
