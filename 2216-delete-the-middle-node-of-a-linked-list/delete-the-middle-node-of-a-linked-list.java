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
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size == 1) {
            head= null;
            return head;
        }

        int midIdx = size / 2;

        temp = head;
        for (int i = 0; i < midIdx - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }
}