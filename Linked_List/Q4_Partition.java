//QUESTION-->
//Write code to partition a linked list around a value x, such that all nodes less than x come
// before all nodes greater than or equal to x. If x is contained within the list the values of x only need
// to be afer the elements less than x (see below). The partition element x can appear anywhere in the
// "right partition"; it does not need to appear between the left and right partitions.
// EXAMPLE
// Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
// Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

//ANSWER-->


class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q4_Partition{
    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node; // Initialize head to the starting node
        LinkedListNode tail = node; // Initialize tail to the starting node
        
        while (node != null) {
            LinkedListNode next = node.next; // Save the next node
            if (node.data < x) {
                // Insert node at head
                node.next = head;
                head = node;
            } else {
                // Insert node at tail
                tail.next = node;
                tail = node;
            }
            node = next; // Move to the next node
        }
        tail.next = null; // Set the end of the list
        
        // Return the updated head of the list
        return head;
    }

    public static void printList(LinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        LinkedListNode node = new LinkedListNode(3);
        node.next = new LinkedListNode(5);
        node.next.next = new LinkedListNode(8);
        node.next.next.next = new LinkedListNode(5);
        node.next.next.next.next = new LinkedListNode(10);
        node.next.next.next.next.next = new LinkedListNode(2);
        node.next.next.next.next.next.next = new LinkedListNode(1);

        System.out.println("Original list:");
        printList(node);

        LinkedListNode newHead = partition(node, 5);

        System.out.println("Partitioned list:");
        printList(newHead);
    }
}