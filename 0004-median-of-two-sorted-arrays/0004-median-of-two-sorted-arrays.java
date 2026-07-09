class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
            }
            else{
                merged[k++] = nums2[j++];
            }
        }
        while(i < n1){
            merged[k++] = nums1[i++];
        }
        while(j < n2){
            merged[k++] = nums2[j++];
        }
        int totalLength = n1 + n2;
        if(totalLength % 2 == 1){
            return merged[totalLength / 2];
        }
        else{
            int mid = totalLength / 2;
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
    }
}