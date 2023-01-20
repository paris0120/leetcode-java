import java.util.Arrays;

public class Solution2500 {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] g:grid) Arrays.sort(g);
        int o = 0;
        for(int i = 0;i<grid[0].length;i++) {
            int m = grid[0][i];
            for(int j = 1;j<grid.length;j++) {
                if(grid[j][i]>m) m= grid[j][i];
            }
            o+=m;
        }
        return o;
    }
}
