class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q5_Sum_List{
    LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode result = new LinkedListNode(0);
        LinkedListNode current = result;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new LinkedListNode(sum % 10);
            current = current.next;
        }
        
        return result.next; // Return the actual head of the result list
    }

    public static void printList(LinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListNode input1 = new LinkedListNode(3);
        input1.next = new LinkedListNode(1);
        input1.next.next = new LinkedListNode(2);

        LinkedListNode input2 = new LinkedListNode(3);
        input2.next = new LinkedListNode(1);
        input2.next.next = new LinkedListNode(2);

        Q5_Sum_List text = new Q5_Sum_List();
        LinkedListNode ans = text.addLists(input1, input2);
        printList(ans);
    }
}
