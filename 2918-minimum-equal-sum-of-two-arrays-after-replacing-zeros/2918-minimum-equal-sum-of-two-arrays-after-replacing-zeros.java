class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        // int n = nums1.length;
        // int m = nums2.length;
        // int sum1 = 0, sum2 = 0;
        // for(int i = 0 ; i < m ; i++){
        //     if(nums2[i] == 0){
        //         nums2[i] = 1;
        //     }
        // }
        // sum1 = 0;
        // sum2 = 0;
        // for(int i = 0 ; i < m ; i++){
        //     sum2 += nums2[i];
        // }
        // for(int i = 0 ; i < n ; i++){
        //     sum1 += nums1[i];
        // }
        // System.out.println(sum1);
        // System.out.println(sum2);
        // if(sum1 == sum2) return sum1;
        // return -1;
        long sum1 = 0;
        long zeros1 = 0;
        for (int num : nums1) {
            if (num == 0) zeros1++;
            else sum1 += num;
        }        
        long sum2 = 0;
        long zeros2 = 0;
        for (int num : nums2) {
            if (num == 0) zeros2++;
            else sum2 += num;
        }
        long minSum1 = sum1 + zeros1;
        long minSum2 = sum2 + zeros2;
        if (minSum1 > minSum2 && zeros2 == 0) {
            return -1;
        }
        if (minSum2 > minSum1 && zeros1 == 0) {
            return -1;
        }
        return Math.max(minSum1, minSum2);
    }
}