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
    public ListNode deleteMiddle(ListNode head) {
        int c = 0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(c == 1) return head.next;
        temp = head;
        int cnt = 0;
        while(cnt<(c/2)-1){
        temp = temp.next;
            cnt++;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}