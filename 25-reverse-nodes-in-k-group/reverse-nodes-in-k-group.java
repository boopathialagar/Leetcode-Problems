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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode temp = head;
        dummy.next = head;
        ListNode previousGroup = dummy;
        while(true){
            ListNode kth = findKNode(temp,k);
            if(kth == null)break;
            ListNode nextGroup = kth.next;
            kth.next = null;
            ListNode newHead = reverse(temp);
            previousGroup.next = newHead;
            temp.next = nextGroup;
            previousGroup = temp;
            temp = nextGroup;
        }
        return dummy.next;
    }
    public ListNode findKNode(ListNode cur,int k){
        while(cur != null && k>1){
            cur = cur.next;
            k--;
        }
        return cur;
    }
}