import java.util.HashSet;

public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        HashSet<Integer> s = new HashSet<>();
        for(int a:arr) {
            min = min<a?min:a;
            max = max>a?max:a;
            s.add(a);
        }
        int d = (max-min)/(arr.length-1);
        if(max>min && d == 0) return false;
        for(int i = 0;i<arr.length;i++) {
            if(!s.contains(min)) return false;
            min+=d;
        }
        return true;
    }
}
