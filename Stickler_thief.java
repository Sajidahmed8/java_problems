/**
Problem : 7

    Stickler the thief wants to loot money from a society having n houses in a single line. 
    He is a weird person and follows a certain rule when looting the houses. According to the rule, 
    he will never loot two consecutive houses. At the same time, he wants to maximize the amount 
    he loots. The thief knows which house has what amount of money but is unable to come up with an 
    optimal looting strategy. He asks for your help to find the maximum money he can get if he 
    strictly follows the rule. ith house has a[i] amount of money present in it.

    Example 1:

        Input:
            n = 5
            a[] = {6,5,5,7,4}
        Output: 
            15
        Explanation: 
            Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.

    Example 2:

        Input:
            n = 3
            a[] = {1,5,3}
        Output: 
            5
        Explanation: 
            Loot only 2nd house and get maximum amount of 5.
        Your Task:
            Complete the functionFindMaxSum() which takes an array arr[] and n as input which 
            returns the maximum money he can get following the rules.

    Expected Time Complexity:O(N).
    Expected Space Complexity:O(N).

    Constraints:
        1 ≤ n ≤ 10^5
        1 ≤ a[i] ≤ 10^4

**/

// Solution :-

import java.util.*;
import java.io.*;

class Stickler
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0; i<n; ++i){
	            arr[i] = sc.nextInt();
            }
  	        System.out.println(new Solution().FindMaxSum(arr, n));
	    }
    }
}

class Solution
{
    public int FindMaxSum(int arr[], int n)
    {
        if(n == 0){
            return 0;
        }
        int p1 = 0;
        int p2 = 0;
        for(int ele : arr){
            int temp = p1;
            p1 = Math.max(p2 + ele , p1);
            p2 = temp;
        }
        return p1;
    }
};


