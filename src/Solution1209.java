/**
 * 1209. Remove All Adjacent Duplicates in String II
 * tc: O(n)
 * sc: O(n)
 */
public class Solution1209 {

    public String removeDuplicates(String s, int k) {
        int[] p = new int[s.length()+1];
        int c = 1;
        p[0] = -1;
        p[1] = 0;
        for(int i = 1; i < s.length(); i++) {
            p[i+1] = i;
            if(p[i]>=0 && s.charAt(i) == s.charAt(p[i])) {
                c++;
                if(c==k) {
                    int cp = i;
                    while(c>0) {
                        cp = p[cp];
                        c--;
                    }
                    p[i+1] = cp;

                    if(cp>=0) {
                        char cc = s.charAt(cp);
                        while(cc==s.charAt(cp))  {
                            c++;
                            cc = s.charAt(cp);
                            cp = p[cp];
                            if(cp<0) break;

                        }
                    }
                }

            }
            else {
                c = 1;
            }
        }


        StringBuilder sb = new StringBuilder();
        c = p[s.length()];
        while(c>=0) {
            sb.append(s.charAt(c));
            c = p[c];
        }
        return sb.reverse().toString();

    }
}
