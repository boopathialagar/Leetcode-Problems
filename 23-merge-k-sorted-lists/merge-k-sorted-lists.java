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
        if(lists.length ==0)return null;
        return helper(lists,0,lists.length-1);
    }

    public ListNode helper (ListNode[] lists,int st,int end){
        if(st == end)return lists[st];
        else if(st == end-1) return merger(lists[st],lists[end]);
        int mid = (st+end)/2;
        ListNode left = helper(lists,st,mid);
        ListNode right = helper(lists,mid+1,end);
        return merger(left,right);
    }

    public ListNode merger(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 == null ? l2 : l1;
        return dummy.next;
    }

}