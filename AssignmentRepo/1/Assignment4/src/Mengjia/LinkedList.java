package Mengjia;

public class LinkedList{
    public int size;
    public Node head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void addAtPosition(int index, int element){
        synchronized (Main.obj){
            if(head == null){
                head = new Node(element);
                size++;
            } else{
                if (index > size || index < 0) return;

                size++;
                Node prev = head;
                for(int i = 0; i < index; i++) {
                    if(prev.next != null) prev = prev.next;
                }

                Node newNode = new Node(element);
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
    }
    public void removeAtPosition(int index, int element){
        synchronized (Main.obj){
            if (index < 0 || index >= size) return;

            size--;

            Node prev = head;
            for(int i = 0; i < index; i++){
                prev = prev.next;
            }

            prev.next = prev.next.next;
        }
    }
    public int getFirst() {
        synchronized (Main.obj){
            if(head == null){
                return 0;
            }
            return head.val;
        }
    }
    public int getLast() {
        synchronized (Main.obj){
            if(head == null){
                return 0;
            }
            Node cur = head;
            int lastVal = head.val;
            while(cur != null){
                lastVal = cur.val;
                cur = cur.next;
            }

            return lastVal;
        }
    }
    public int size(){
        synchronized (Main.obj){
            return size;
        }
    }
}
