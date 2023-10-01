/**
Problem : 20

    Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible
    when tree is visited from Left side. The task is to complete the function leftView(), which 
    accepts root of the tree as argument.

    Left view of following tree is 1 2 4 8.

              1
           /     \
          2        3
      /     \    /    \
      4      5  6      7
       \
        8 
        
    Example :
        Input:
                 1
                /  \
               3    2
        Output: 1 3

    Your Task:
        You just have to complete the function leftView() that returns an array containing the nodes
        that are in the left view. The newline is automatically appended by the driver code.

    Expected Time Complexity: O(N).
    Expected Auxiliary Space: O(N).

    Constraints:
        0 <= Number of nodes <= 100
        1 <= Data of a node <= 1000

**/

// Solution :-

class Tree
{
    //Function to return list containing elements of left view of binary tree.
    public void fun(Node root, int level, ArrayList<Integer> lft){
        if(root == null){
            return;
        }
        if(level == lft.size()){
            lft.add(root.data);
        }
        fun(root.left, level + 1, lft);
        fun(root.right, level + 1, lft);
    }
    
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> lft = new ArrayList<Integer>();
      fun(root, 0, lft);
      return lft;
    }
}