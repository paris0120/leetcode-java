import java.util.Stack;

public class Solution1073 {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        Stack<Integer> s = new Stack<>();
        int c = 0;
        if(arr1.length>arr2.length) {
            int[] tmp = arr1;
            arr1 = arr2;
            arr2 = tmp;
        }
        int i = 1;
        while(i<=arr1.length) {
            int n = c + arr1[arr1.length-i] + arr2[arr2.length-i];
            if(n>1) {
                c = -1;
                n-=2;
            }
            else if(n<0) {
                n = 1;
                c = 1;
            }
            else c = 0;

            s.add(n);
            i++;
        }
        while(i<=arr2.length) {
            int n = c + arr2[arr2.length-i];
            if(n>1) {
                c = -1;
                n-=2;
            }
            else if(n<0) {
                n = 1;
                c = 1;
            }
            else c = 0;
            s.add(n);
            i++;
        }
        if(c<0) {
            s.add(1);
            s.add(1);
        }
        if(c>0) {
            s.add(1);
        }
        c = s.pop();
        while(c==0) {
            if(c==0 && s.size()==0) return new int[]{0};
            c = s.pop();
        }
        int[] o = new int[s.size()+1];
        o[0] = c;
        i = 1;
        while(s.size()>0) {
            o[i] = s.pop();
            i++;
        }
        return o;
    }
}
