import java.util.Arrays;

public class Solution0274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int l = citations.length;
        for(int i=0;i<l;i++) {
            if(citations[i]>=l-i) {
                return l-i;
            }
        }
        return 0;
    }
}
