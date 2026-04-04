class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size ;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index<0 || index >=size)return -1;
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node nn = new Node(val);
        if(head == null){
            head = nn;
            tail=nn;
        }else{
        head.prev = nn;
        nn.next = head;
        head = nn;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node nn= new Node(val);
        if(head == null){
            head = nn;
            tail = nn;
        }else{
        tail.next = nn;
        nn.prev = tail;
        tail = nn;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)return;

        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node nn = new Node(val);
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        nn.prev = temp.prev;
        nn.next = temp;
        temp.prev = nn;
        nn.prev.next = nn;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || index>=size)return;

        if(index == 0){
            head = head.next;
            if(head != null)
            head.prev = null;
            size--;
            return;
        }
        if(index == size-1){
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
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