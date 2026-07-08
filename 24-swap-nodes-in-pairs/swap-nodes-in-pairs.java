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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = null;
        ListNode second = null;
        ListNode temp = head;
        ListNode next = null;
        ListNode prev = dummy;
        while(temp != null && temp.next != null){
            first = temp;
            second = temp.next;
            next = second.next;
            second.next = first;
            first.next = next;
            prev.next = second;
            prev = first;
            temp = temp.next;
        }
        prev.next = temp;
        return dummy.next;
    }
}