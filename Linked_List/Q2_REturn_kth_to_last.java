class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    public static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        // Move p1 k steps ahead
        for (int i = 0; i < k; i++) {
            if (p1 == null) {
                return null; // k is greater than the length of the list
            }
            p1 = p1.next;
        }

        // Move both pointers until p1 reaches the end
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        // p2 is now pointing to the k-th to last node
        return p2;
    }

    // Helper method to print the linked list
    public static void printList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);

        // Print the original list
        System.out.print("Original List: ");
        printList(head);

        // Find the 2nd to last element
        LinkedListNode result = nthToLast(head, 2);

        if (result != null) {
            System.out.println("The 2nd to last element is: " + result.data);
        } else {
            System.out.println("The list is shorter than " + 2 + " elements.");
        }
    }
}