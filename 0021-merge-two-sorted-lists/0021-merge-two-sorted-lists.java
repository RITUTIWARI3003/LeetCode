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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
       ListNode h = null;
        ListNode temp = null;
        if(list1.val <= list2.val){
            h = list1;
            temp = h.next;
            h.next = null;
            h.next = mergeTwoLists(temp,list2);
            
        }else{
            h = list2;
            temp = h.next;
            h.next = null;
            h.next = mergeTwoLists(list1,temp);
        }
        
        return h;
    }
}