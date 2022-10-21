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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode h = null;
        ListNode t = null;
        ListNode p1 = l1;
        ListNode p2 = l2;
        
        if(l1.val<=l2.val){
            h = l1;
            t = l1;
            p1 = p1.next;
        }else{
            h = l2;
            t = l2;
            p2 = p2.next;
        }
        while(p1 != null && p2 != null){
            if(p1.val<=p2.val){
                t.next = p1;
                p1 = p1.next;
            }else{
                t.next = p2;
                p2 = p2.next;
            }
            t = t.next;
        }
            
            if(p1 != null) t.next = p1;
            if(p2 != null) t.next = p2;
            
            return h;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode res = lists[0];
        
        for(int i = 1;i<lists.length;i++){
            res = merge(res,lists[i]);
        }
     return res;   
    }
}