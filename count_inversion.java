/**
Problem : 19

    Given an array of integers. Find the Inversion Count in the array. 

    Inversion Count: For an array, inversion count indicates how far (or close) the array is from 
    being sorted. If the array is already sorted then the inversion count is 0.
    If an array is sorted in the reverse order then the inversion count is the maximum. 
    Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

    Example 1:
        Input: N = 5, arr[] = {2, 4, 1, 3, 5}
        Output: 3
        Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

    Example 2:
        Input: N = 5
            arr[] = {2, 3, 4, 5, 6}
        Output: 0
        Explanation: As the sequence is already sorted so there is no inversion count.

    Example 3:
        Input: N = 3, arr[] = {10, 10, 10}
        Output: 0
        Explanation: As all the elements of array are same, so there is no inversion count.

    Your Task:
        You don't need to read input or print anything.
        Your task is to complete the function inversionCount() which takes the array arr[] and the 
        size of the array as inputs and returns the inversion count of the given array.

    Expected Time Complexity: O(NLogN).
    Expected Auxiliary Space: O(N).

    Constraints:
        1 ≤ N ≤ 5*10^5
        1 ≤ arr[i] ≤ 10^18

**/

// Solution :- 

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergesort(arr, 0, (int)N - 1);
    }
    
    static long mergesort(long arr[], int l, int r){   // l- left, r- right
        long count = 0;
        if(l < r){
            int m = (l + r) / 2;      // m- mid value
        
            count += mergesort(arr, l, m);          // sort left sub-array
            count += mergesort(arr, m + 1, r);      // sort right sub-array
            
            count += merge(arr, l, m, r);       //merge two sorted sub-array and split
        }
        return count;
    }
    
    static long merge(long arr[], int l, int m, int r){     //l-left,r-right,m-mid value
        int n1 = (m - l) + 1;
        int n2 = r - m;
        
        long[] larr = new long[n1];
        long[] rarr = new long[n2]; 
        
        for(int i=0;i<n1;i++){              // copy data to temporary left array         
            larr[i] = arr[l + i];
        }
        for(int j=0;j<n2;j++){              // copy data to temporary right array
            rarr[j] = arr[m + 1 + j];
        }
        
        long count = 0;
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i < n1 && j < n2){
            if(larr[i] <= rarr[j]){
                arr[k++] = larr[i++];
            }
            else{                           // if leftarray > rightarray; so, inversion occur
                arr[k++] = rarr[j++];
                count += (n1 - i);
            }
        }
        
        while(i < n1){                  // copy the left elements of left array
            arr[k++] = larr[i++];
        }
        while(j < n2){                  // copy the left elements of right array
            arr[k++] = rarr[j++];
        }
        return count;
    }
}