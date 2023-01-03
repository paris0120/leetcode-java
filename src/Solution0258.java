public class Solution0258 {
    public int addDigits(int num) {
        while(num>9) {
            int n = 0;
            while(num>9) {
                n+=num%10;
                num/=10;
            }
            n+=num;
            num = n;
        }
        return num;
    }
}
