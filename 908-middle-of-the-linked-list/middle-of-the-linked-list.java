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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        // int midIdx = 0;
        // if (size % 2 == 0)
        //     midIdx = size / 2;
        // else
           int midIdx = size / 2;

        ListNode target = head;
        for (int i = 0; i < midIdx; i++) {
            target = target.next;
        }
        return target;
    }
}