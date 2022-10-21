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
    public ListNode mergek(ListNode[] l,int i,int j){
        if(i==j) return l[i];
        int mid = (i+j)/2;
        ListNode h1 = mergek(l,i,mid);
        ListNode h2 = mergek(l,mid+1,j);
        return merge(h1,h2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return mergek(lists,0,lists.length-1);
    }
}