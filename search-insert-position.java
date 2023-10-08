/**
Problem : 34

    Given a sorted array of distinct integers and a target value, return the index if the target is 
    found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.

        Example 1:
            Input: nums = [1,3,5,6], target = 5
            Output: 2

        Example 2:
            Input: nums = [1,3,5,6], target = 2
            Output: 1

        Example 3:
            Input: nums = [1,3,5,6], target = 7
            Output: 4
 
    Constraints:
        * 1 <= nums.length <= 10^4
        * -10^4 <= nums[i] <= 10^4
        * nums contains distinct values sorted in ascending order.
        * -10^4 <= target <= 10^4

**/

// Solution :- 

class Solution {
    public int searchInsert(int[] nums, int target) {
        int sp = 0;                 // sp - start point
        int ep = nums.length - 1;   // ep - end point

        while(sp <= ep){
            int m = sp + (ep - sp)/2;   // m - mid
            if(nums[m] == target){
                return m;
            }
            else if(nums[m] > target){
                ep = m - 1;
            }
            else{
                sp = m + 1;
            }
        }
        return sp;
    }
}