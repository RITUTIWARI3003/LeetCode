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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Map<ListNode , Boolean> nodesMap = new HashMap<>();
        
        while(curr != null){
            if(nodesMap.containsKey(curr)) return true;
            nodesMap.put(curr,true);
            curr = curr.next;
        }
        return false;
    }
}