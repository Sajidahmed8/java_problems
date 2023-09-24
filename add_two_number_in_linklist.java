/**
Problem : 8
	
	You are given two non-empty linked lists representing two non-negative integers. The digits are 
    stored in reverse order, and each of their nodes contains a single digit. Add the two numbers 
    and return the sum as a linked list.

	You may assume the two numbers do not contain any leading zero, except the number 0 itself. 
	
	Example 1:

		Input: l1 = [0], l2 = [0]
		Output: [0]
	
	Example 3:

		Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
		Output: [8,9,9,9,0,0,0,1]

	Constraints:

		The number of nodes in each linked list is in the range [1, 100].
		0 <= Node.val <= 9
		It is guaranteed that the list represents a number that does not have leading zeros.
**/

// Solution :-


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;

            int sum = n1 + n2 + carry;
            int n = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(n); 
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = head.next;
        head.next = null;
        return result;
        
    }
}