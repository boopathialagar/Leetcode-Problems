class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class MyLinkedList {
Node head,tail;
int size;
    public MyLinkedList() {
        head = tail = null;
        size =0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size)return -1;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(tail == null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index > size)return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        if(newNode.next == null){
            tail = newNode;
        }
        size++;

    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index >= size)return;
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            return;
        }

        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        if(temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
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