public class Solution0013 {
    public int romanToInt(String s) {
        int o = 0;
        int last = 10000;
        for(char c:s.toCharArray()) {
            int i = 0;
            switch(c) {
                case 'I': i = 1; break;
                case 'V': i = 5; break;
                case 'X': i = 10; break;
                case 'L': i = 50; break;
                case 'C': i = 100; break;
                case 'D': i = 500; break;
                case 'M': i = 1000; break;
            }
            if(last<10000)
                if(last<i) o-=last;
                else o+=last;
            last = i;
        }
        o+=last;
        return o;

    }
}
