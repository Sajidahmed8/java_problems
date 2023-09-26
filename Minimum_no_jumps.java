/**
Problem : 13

    Given an array of N integer arr[] where each element represents the maximum length of the jump 
    that can be made forward from that element. This means if arr[i]=x, then we can jump any distance
    y such that y<=x. Find the minimum number of jumps to reach the end of the array. If an element 
    is 0, then you cannot move through that element.
    
    Note : Return -1 if you cannot reach the end of the array.

    Example :
        Input :
            N = 11
            arr[] = {1,3,5,8,9,2,6,7,6,8,9}
        Output : 3

        Explanation : First jump from 1st element to 2nd element with value 3. Now, from here 
                we jump to 5th element with value 9, and from here we will jump to the last.

    Constraints :
        1<=N<=10^7
        0<=arr[i]<=10^7

**/

// Solution :-

class Solution{
    static int minJumps(int[] arr){
        // your code here
        int result = 0;
        int step = 0;
        int reach = 0;
        
        while(reach < arr.length-1){
            int far = 0;
            if(reach >= arr.length){
                return result;
            }
            for(int i=step;i<=reach;i++){
                far = Math.max(far, i + arr[i]);
            }
            result++;
            if(far == 0){
                return -1;
            }
            step = reach + 1;
            reach = far;
        }
        return result;
    }
}