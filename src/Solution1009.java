public class Solution1009 {
    public int bitwiseComplement(int n) {
        int c = 1;
        int b = 1;
        while(c<n) {
            b*=2;
            c+=b;
        }
        return c - n;
    }
}
