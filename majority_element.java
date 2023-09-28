/**
Problem : 16

    Given an array A of N elements. Find the majority element in the array. A majority element 
    in an array A of size N is an element that appears strictly more than N/2 times in the array.
 
    Example 1:
        Input:
            N = 3 
            A[] = {1,2,3} 
        Output:
            -1
        Explanation: Since, each element in {1,2,3} appears only once so there is no majority 
        element.

    Example 2:
        Input:
            N = 5 
            A[] = {3,1,3,3,2} 
        Output:
            3
        Explanation: Since, 3 is present more than N/2 times, so it is the majority element.

    Your Task:
        The task is to complete the function majorityElement() which returns the majority element 
        in the array. If no majority exists, return -1.
 
    Expected Time Complexity: O(N).
    Expected Auxiliary Space: O(1).

    Constraints:    
        1 ≤ N ≤ 107
        0 ≤ Ai ≤ 106

**/

// Solution :- 

class Solution
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        int n = -1;
        int c = 0;
        int i = 0;
        
        for(i=0;i<size;i++){
            if(c == 0){
                n = arr[i];
                c = 1;
            }
            else if(arr[i] == n){
                c++;
            }
            else{
                c--;
            }
        }
        c = 0;
        for(i=0;i<size;i++){
            if(arr[i] == n){
                c++;
            }
        }
        if(c > size / 2){
            return n;
        }
        else{
            return (-1);
        }
    }
}