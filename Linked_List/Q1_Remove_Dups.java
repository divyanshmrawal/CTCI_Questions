import java.util.HashSet;

class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1_Remove_Dups {
    
    void removingDuplicateLetters(LinkedListNode input) {
        if (input == null) return;

        HashSet<Integer> set = new HashSet<>();
        LinkedListNode current = input;
        LinkedListNode previous = null;

        while (current != null) {
            if (set.contains(current.data)) {
                // Remove current node
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }

    // Helper method to print the linked list
    void printList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q1_Remove_Dups q1 = new Q1_Remove_Dups();
        
        // Create a linked list: 1 -> 2 -> 3 -> 2 -> 1
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(2);
        head.next.next.next.next = new LinkedListNode(1);
        
        System.out.println("Original list:");
        q1.printList(head);

        q1.removingDuplicateLetters(head);

        System.out.println("List after removing duplicates:");
        q1.printList(head);
    }
}
