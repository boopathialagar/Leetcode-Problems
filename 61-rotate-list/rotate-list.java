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
        if(head == null || k==0)return head;
        int count =1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        temp.next = head;

        int position = count -(k%count);
        for(int i=0;i<position;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;


    }
}