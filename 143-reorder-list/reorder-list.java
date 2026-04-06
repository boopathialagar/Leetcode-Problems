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
    ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    } 
    public void reorderList(ListNode head) {
        ListNode mid = mid(head);
        ListNode sh = reverse(mid.next);
        mid.next = null;
        ListNode fh = head;
        ListNode temp = head;    
        while(sh!= null){
           ListNode fhNext = fh.next;
           ListNode shNext = sh.next;
           fh.next = sh;
           sh.next = fhNext;
           fh = fhNext;
           sh = shNext;
        } 
    }
}