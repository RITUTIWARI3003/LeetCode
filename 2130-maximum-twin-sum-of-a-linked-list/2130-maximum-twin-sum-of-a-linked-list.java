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
        
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode reverse(ListNode head){
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
    
    public int pairSum(ListNode head) {
        
        ListNode t = reverse(head);
        ListNode h = head;
        int ans = Integer.MIN_VALUE;
        while(h != null && t!= null){
             ans = Math.max(h.val + t.val , ans);
            h = h.next;
            t = t.next;
        }
     return ans;   
    }
}