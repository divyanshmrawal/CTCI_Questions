class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q6_Palindrome {

    public boolean isPalindrome(Node head) {
        if (head == null) {
            return true;
        }

        // Find the middle of the linked list
        Node mid = middle(head);
        // Reverse the second half of the list
        Node last = reverse(mid.next);
        Node current = head;

        // Compare the first half and the reversed second half
        while (last != null) {
            if (last.data != current.data) {
                return false;
            }
            last = last.next;
            current = current.next;
        }

        // Restore the original list (optional)
        mid.next = reverse(last); // Reversing back the second half

        return true;
    }

    private Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        // Use fast and slow pointers to find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        // Reverse the linked list
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        Q6_Palindrome pll = new Q6_Palindrome();
        System.out.println("Is palindrome: " + pll.isPalindrome(head)); // Output: true
    }
}
