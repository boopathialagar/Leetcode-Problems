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
        if(lists.length ==0) return null;
        return helper(lists,0, lists.length-1);
    }
    public ListNode helper(ListNode[] list,int start,int end){
        if(start == end)return list[start];
        else if(start == end-1)return merge(list[start],list[end]);
        int mid = (start+end)/2;
        ListNode left = helper(list, start,mid);
        ListNode right = helper(list,mid+1,end);
        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
            else{
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        temp.next = (l1==null)?l2:l1;
        return dummy.next;
    }
}