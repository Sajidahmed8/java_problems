/**
Problem : 21

    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

    Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

    Constraints:
        * 1 <= strs.length <= 200
        * 0 <= strs[i].length <= 200
        * strs[i] consists of only lowercase English letters.

**/

// Solution :- 

class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int index = 0;

        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0, index);        
    }
}