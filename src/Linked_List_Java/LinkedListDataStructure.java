package Linked_List_Java;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist {
    Node head;
    Node tail;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
    }

    void display() {
        if (head == null) return;
        ;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //     void delete(int idx) {
//        if(idx<0 || idx>=size){
//            System.out.println("Invalid index!");
//            return;
//        }
//        if(idx==0){
//            deleteAtHead();
//            return;
//        }
//        Node temp = head;
//        int size;
//        for(int i=1; i<=idx-1; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;// delete
//         if(idx == size-1) tail = temp;
//         size--;
//
//    }
//}
    public class LinkedListDataStructure {
        public static void main(String[] args) {
            Linkedlist ll = new Linkedlist();
            ll.addAtTail(10);
            ll.addAtTail(20);
            ll.addAtTail(30);
            ll.addAtTail(40);
            ll.display();
            ll.deleteAtHead();
            ll.display();

//        ll.delete(2); ll.display();
        }

    }
}
