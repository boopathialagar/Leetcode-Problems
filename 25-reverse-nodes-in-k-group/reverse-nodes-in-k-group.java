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
        ListNode next = null;
        ListNode cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;  
        }
    return prev;
    }
    public ListNode kth(ListNode head,int k){
        ListNode cur = head;
        while(cur !=null && k>1){
            cur = cur.next;
            k--;
        }
        return cur;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        ListNode temp =head;
        while(true){
            ListNode kth = kth(temp, k);
            if(kth == null)break;
            ListNode nextGroup = kth.next;
            kth.next = null;
            ListNode newHead = reverse(temp);
            prevGroup.next = newHead;
            temp.next = nextGroup;
            prevGroup = temp;
            temp = temp.next;
        }
        return dummy.next;
    }
}