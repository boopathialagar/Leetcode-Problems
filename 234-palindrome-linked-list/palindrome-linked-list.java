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

    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static ListNode reverse(ListNode sh){
        ListNode prev = null;
        ListNode cur = sh;
        ListNode next = null;
        while(cur!= null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode sh = middle(head);
        ListNode fh = head;
        sh =  reverse(sh);
        while(sh != null&&fh !=null){
            if(sh.val != fh.val){
                return false;
            }
            sh=sh.next;
            fh = fh.next;
        }
        return true;
    }
}