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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 || lists == null) return null;
        return helper(lists, 0, lists.length - 1);
    }

    public ListNode helper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge2List(lists[start], lists[end]);
        }
        int mid = (start + end) / 2;
        ListNode left = helper(lists, start,mid);
        ListNode right = helper(lists, mid + 1, end);
        return merge2List(left, right);
    }

    public ListNode merge2List(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                temp.next = l2;
                l2 = l2.next;
                 temp = temp.next;
            }
            else{
                temp.next = l1;
                l1 = l1.next;
                 temp = temp.next;
            }
           
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return dummy.next;
    }
}
