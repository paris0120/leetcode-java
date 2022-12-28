public class Solution0011 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        boolean b = true;
        if(height[i]<height[j]) b = false;
        int maxHeight = Math.max(height[i], height[j]);
        int minHeight = Math.min(height[i], height[j]);
        int water = (height.length-1)*Math.min(height[i], height[j]);
        while(i+1<j) {
            int h;
            if(b) {
                j--;
                h = height[j];
            }
            else {
                i++;
                h = height[i];

            }
            if(h>minHeight) {
                minHeight = Math.min(h, maxHeight);
                water = Math.max(water, minHeight*(j-i));

            }
            if(h>maxHeight) {
                b = b == false;
                maxHeight = h;
            }

        }
        return water;
    }
}
