
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    public MyLinkedList() {
        tail = head = null;

    }
    
    public int get(int index) {
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if(count == index){
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head =tail= newNode;
        }
        else{
            newNode.next = head;
            head =   newNode;
        }
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void addAtIndex(int index, int val) {
        int count =0;
        Node temp = head;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        while(temp !=null&& count <index-1 ){
             temp = temp.next;
            count++;
              
            }
            if(temp == null)return ;
            newNode.next = temp.next;
            temp.next = newNode;
           if(newNode.next == null)tail = newNode;
                
           
        }

    
    
    public void deleteAtIndex(int index) {
        if(head == null) return;

        int count =0;
        Node temp = head;
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
                return;
            }
        }
        while(temp.next!=null && count<index-1){
            temp = temp.next;
            count++;
        }
        if(temp.next == null)return;
        temp.next = temp.next.next;
        if(temp.next == null)tail = temp;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */