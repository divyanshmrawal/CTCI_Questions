//QUESTION-->
//Implement an algorithm to delete a node in the middle (i.e., any node but the frst and last node, not necessarily the exact middle) of a singly linked list, given only access to that node. 

//ANSWER-->

//My Solution :---
import java.util.LinkedList;
public class Q3_Delete_Middle_Node {

    public static void main(String[] args) {
        //Creating linkedlist
        LinkedList<Integer> list=new LinkedList<>();
        //adding elements in linkedlist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //finding length of list
int size=list.size();
// finding middel element of list
int middel=0;
if(size%2==0){
     middel=(size/2)-1;
}
else{
     middel=(size/2);
}
//Original list
System.out.println(list);
//remove middel element
list.remove(middel);
//updated list
System.out.println(list);
    }
}

//Book solution:----
class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // Method to delete a node given a reference to that node
    public static boolean deleteNode(LinkedListNode n) {
        // Check if the node is null or if it's the last node
        if (n == null || n.next == null) {
            return false; // Failure
        }
        
        // Copy data from the next node and bypass the next node
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        
        return true; // Success
    }

    public static void main(String[] args) {
        // Example usage
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        
        System.out.println("Before deletion: ");
        printList(head);
        
        // Deleting the node with value 2
        deleteNode(head.next);
        
        System.out.println("After deletion: ");
        printList(head);
    }

    // Helper method to print the linked list
    public static void printList(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
