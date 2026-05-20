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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null)return head;
        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        temp.next = head;
        int position = count - (k%count);
        for(int i=0;i<position;i++){
            temp= temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}