public class Solution0980 {
    public int uniquePathsIII(int[][] grid) {
        int m = 0;
        int sr = 0;
        int sc = 0;
        for(int r = 0;r<grid.length;r++) {
            for(int c=0;c<grid[r].length;c++) {
                switch(grid[r][c]){
                    case 1:
                        sr = r;
                        sc = c;
                        break;
                    case -1: break;
                    default: m++;
                }
            }
        }

        return pos(grid, sr, sc, m);


    }

    public int pos(int[][] grid, int r, int c, int m) {
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]<0) return 0;
        switch(grid[r][c]) {
            case -1: return 0;
            case 2: if(m==0) return 1; else return 0;
            default:
                grid[r][c] = -1;
                int o = pos(grid, r+1, c, m-1) + pos(grid, r-1, c, m-1) + pos(grid, r, c+1, m-1) + pos(grid, r, c-1, m-1);
                grid[r][c] = 0;
                return o;
        }
    }
}
