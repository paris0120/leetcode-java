public class Solution0135 {
    public int candy(int[] ratings) {
        int[] o = new int[ratings.length];
        for(int i = 1;i<ratings.length;i++) {
            if(ratings[i]>ratings[i-1]) o[i] = o[i-1]+1;
        }

        int s = o[ratings.length-1]+1;
        for(int i = ratings.length-2;i>=0;i--) {
            if(ratings[i]>ratings[i+1]) o[i] = Math.max(o[i+1]+1, o[i]);
            s+=(o[i]+1);
        }

        return s;
    }
}
