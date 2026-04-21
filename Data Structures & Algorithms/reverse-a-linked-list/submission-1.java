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
    public ListNode reverseList(ListNode head) {

        // declare prev, curr, next nodes
        ListNode prev = null;
        ListNode curr = head;
        
        // loop through the list
        while (curr != null) {
            // save current next
            ListNode next = curr.next;
            // point current next to be prev
            curr.next = prev;

            // increment current and prev
            prev = curr;
            curr = next;
        }

        return prev;


        
    }
}
