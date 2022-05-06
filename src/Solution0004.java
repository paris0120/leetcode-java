/**
 * 4. Median of Two Sorted Arrays
 * tc:O(n)
 * sc:O(1)
 */
public class Solution0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length+nums2.length;
        int n = size/2+1;
        int n1 = 0;
        int n2 = 0;
        int v1 = 0;
        int v2 = 0;
        for(int i = 0;i<n;i++) {
            v2 = v1;
            if(n1==nums1.length) {
                v1 = nums2[n2];
                n2++;
            }
            else if(n2==nums2.length) {
                v1 = nums1[n1];
                n1++;
            }
            else if(nums2[n2]>nums1[n1]) {
                v1 = nums1[n1];
                n1++;
            }
            else {
                v1 = nums2[n2];
                n2++;
            }

        }
        if(size%2 == 1) {
            return v1;
        }
        else {
            return ((double)v1+v2)/2;
        }
    }
}
