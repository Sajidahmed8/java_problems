/**
Problem : 30

    Given n pairs of parentheses, write a function to generate all combinations of well-formed 
    parentheses.

    Example 1:
        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]

    Example 2:
        Input: n = 1
        Output: ["()"]
 
    Constraints:
        1 <= n <= 8

**/

// Solution :- 

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        backtrack ("", n, n, lst);
        return lst;        
    }

    public void backtrack(String s, int open, int close, List<String> lst){
        if(open > close){
            return;
        }
        if(open > 0){
            backtrack(s + "(", open - 1, close, lst);
        }
        if(close > 0){
            backtrack(s + ")", open, close - 1, lst);
        }
        if(open == 0 && close == 0){
            lst.add(s);
        }
    }
}