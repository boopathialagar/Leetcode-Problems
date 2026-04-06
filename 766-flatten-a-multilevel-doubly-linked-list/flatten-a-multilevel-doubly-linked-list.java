/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node cur = head;
        while(cur!=null){
            if(cur.child != null){
                Node next = cur.next;
                cur.next = flatten(cur.child);
                cur.child.prev = cur;
                cur.child = null;

                while(cur.next != null){
                    cur = cur.next;
                }
                cur.next = next;
                if(next != null){
                    next.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}