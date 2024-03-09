package ArrayList_Program;
import java.util.Scanner;

class Node {
    int Data;
    Node next;

    Node(int Data) {
        this.Data = Data;
        this.next = null;
    }
}

public class InsertAtBeg {

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(13);
        Node c=new Node(14);
        Node d=new Node(15);
        Node e=new Node(17);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node newHead = insertAtBeg(a);
        printLinkedList(newHead); // Print the updated linked list
    }

    public static Node insertAtBeg(Node head){
        Node newNode=new Node(8);
        newNode.next=head;
        return newNode; // return the new head of the linked list
    }

    // Helper method to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.Data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
