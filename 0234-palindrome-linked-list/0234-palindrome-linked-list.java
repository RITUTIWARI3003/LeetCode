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
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head ){
        ListNode mid = getMid(head);
        ListNode curr = mid;
        ListNode prev = null;
        ListNode temp;
        
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
      ListNode mid = getMid(head);
      ListNode t = reverse(head);
      ListNode h = head;
        while(h != null && t != null){
            if(h.val != t.val) return false;
            h = h.next;
            t= t.next;
        }
        
        return true;
        
    }
}