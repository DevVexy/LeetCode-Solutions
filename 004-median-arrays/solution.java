class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        
        int m = nums1.length, n = nums2.length;
        int baixo = 0, alto = m;

        while (baixo <= alto) {
            int i = (baixo + alto) / 2; // Partição em nums1
            int j = (m + n + 1) / 2 - i; // Partição em nums2

            int maxEsq1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minDir1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
            
            int maxEsq2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minDir2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (maxEsq1 <= minDir2 && maxEsq2 <= minDir1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxEsq1, maxEsq2) + Math.min(minDir1, minDir2)) / 2.0;
                }
                return Math.max(maxEsq1, maxEsq2);
            } else if (maxEsq1 > minDir2) {
                alto = i - 1;
            } else {
                baixo = i + 1;
            }
        }
        return 0.0;
    }
}