package LinkedList.Easy;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverseLL {

    public static Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Helper method to create a sample linked list
    public static Node createLinkedList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        Node head = createLinkedList(data);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

