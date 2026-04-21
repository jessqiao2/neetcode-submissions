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

        // set dummy for merged list
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        // loop while either list has values
        while (list1 != null && list2 != null) {
            // if list1 node > list2 node, add list2 first as the start
            if (list1.val > list2.val) {
                tail.next = list2;
                // iterate through list
                list2 = list2.next;
            } else {
                tail.next = list1;
                list1 = list1.next;
            }
            // iterate through the tail
            tail = tail.next;
        }

        // if either of the lists are null, return the other list as the rest
        tail.next = (list1 != null) ? list1 : list2;
        return dummy.next;
  
    }
}