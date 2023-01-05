import java.util.HashSet;
import java.util.Set;

public class Solution1496 {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        set.add("0,0");
        for(char c:path.toCharArray()) {
            switch(c){
                case 'N': y++; break;
                case 'S': y--; break;
                case 'W': x--; break;
                case 'E': x++; break;
            }
            String s = x+","+y;
            if(set.contains(s)) return true;
            else set.add(s);
        }
        return false;
    }
}
