/**
Problem : 25

    Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N}
    is missing and one number 'B' occurs twice in array. Find these two numbers.

    Example 1:
        Input:
            N = 2
            Arr[] = {2, 2}
        Output: 2 1
        Explanation: Repeating number is 2 and smallest positive missing number is 1.

    Example 2:
        Input:
            N = 3
            Arr[] = {1, 3, 3}
        Output: 3 2
        Explanation: Repeating number is 3 and smallest positive missing number is 2.

    Your Task:
        You don't need to read input or print anything. Your task is to complete the function 
        findTwoElement() which takes the array of integers arr and n as parameters and returns an 
        array of integers of size 2 denoting the answer ( The first index contains B and second 
        index contains A.)

    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(1)

    Constraints:
        2 ≤ N ≤ 10^5
        1 ≤ Arr[i] ≤ N

**/

// Solution :- 

class Solve {
    int[] findTwoElement(int a[], int n) {
        // code here
        int [] arr = new int[2];
        int i;
        
        for(i=0;i<n;i++){
            int index = Math.abs(a[i]) - 1;
            
            if(a[index] < 0){
                arr[0] = Math.abs(index) + 1;
            }
            else{
                a[index] = a[index]* -1;
            }
        }
        for(i=0;i<n;i++){
            if(a[i] > 0){
                arr[1] = i + 1;
            }
        }
        return arr;
    }
}