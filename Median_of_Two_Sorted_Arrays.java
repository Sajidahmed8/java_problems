/**
Problem : 4

    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of 
    the two sorted arrays.
	The overall run time complexity should be O(log (m+n)).

 	Example 1:

        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.

    Example 2:

        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

    Constraints:

        nums1.length == m
        nums2.length == n
        0 <= m <= 1000
        0 <= n <= 1000
        1 <= m + n <= 2000
        -106 <= nums1[i], nums2[i] <= 106

**/

// Solution :- 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int o = m + n;
        int median;
        int nums3 [] = new int [o];

        for(int i=0;i<m;i++){
            nums3[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            nums3[m + i] = nums2[i];
        }
        Arrays.sort(nums3);
        if(o % 2 != 0){
            return (double)nums3[o/2];
        }
        return (double) (nums3[(o-1)/2] + nums3[o/2]) / 2.0;
        
    }
}
