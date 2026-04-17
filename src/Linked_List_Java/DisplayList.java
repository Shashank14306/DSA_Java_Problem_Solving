package Linked_List_Java;
class node{
    int val;
    Node next;
    node(int val){
        this.val = val;
    }
}
public class DisplayList {
    public static void display(Node head){

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(50);

        // Connect Kareneg ( Link )

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
    }
}
