/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;
        ListNode h = head;
        ListNode temp = null;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)  break;}
        
    if(fast == null || fast.next == null ) return null;
            while(slow != h){
                
                h = h.next;
                slow = slow.next;
                
            }
        
        return h;
        
    }
    
}



