import java.util.Stack;

public class MyQueue<T> {
    private Stack<T> stackNewest;
    private Stack<T> stackOldest;

    public MyQueue() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    // Returns the number of elements in the queue
    public int size() {
        return stackNewest.size() + stackOldest.size();
    }

    // Adds an element to the end of the queue
    public void add(T value) {
        stackNewest.push(value);
    }

    // Moves elements from stackNewest to stackOldest to maintain the correct order
    private void shiftStacks() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    // Retrieves the front element of the queue without removing it
    public T peek() {
        shiftStacks(); // Ensure stackOldest has the current elements
        return stackOldest.peek(); // Retrieve the oldest item
    }

    // Removes the front element of the queue and returns it
    public T remove() {
        shiftStacks(); // Ensure stackOldest has the current elements
        return stackOldest.pop(); // Pop the oldest item
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Example usage
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());  // Returns 1
        System.out.println(queue.remove()); // Returns 1
        System.out.println(queue.isEmpty()); // Returns false
        System.out.println(queue.size()); // Returns 1
    }
}
