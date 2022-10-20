/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<Integer>();
        ListNode temp = head;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        
        while(temp != null){
            if(s.peek() != temp.val)
               return false;
           else{ s.pop();
                temp = temp.next;}
            
        }
        return true;
        
    }
}