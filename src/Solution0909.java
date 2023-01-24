import java.util.LinkedList;
import java.util.List;

public class Solution0909 {
    public int snakesAndLadders(int[][] board) {
        int[] n = new int[board.length*board.length+1];
        boolean[] b = new boolean[board.length*board.length+1];
        boolean f = true;
        int p = 1;
        for(int i=board.length-1;i>=0;i--) {
            if(f) for(int j=0;j<board.length;j++) {
                n[p] = board[i][j];
                p++;
            }
            else for(int j=board.length-1;j>=0;j--) {
                n[p] = board[i][j];
                p++;
            }
            f=!f;
        }

        List<Integer> l = new LinkedList<>();
        l.add(1);
        int o = 1;
        n[1] = -2;
        while(l.size()>0) {
            List<Integer> t = new LinkedList<>();
            for(int tn:l) {
                for(int d = 1;d<7;d++) {
                    int dn = d+tn;
                    if(dn>=n.length-1) return o;
                    if(n[dn]>0) dn =n[dn];
                    if(dn>=n.length-1) return o;

                    if(!b[dn]){
                        b[dn] = true;
                        t.add(dn);
                    }
                }
            }
            l = t;
            o++;
        }
        return -1;



    }
}
