import java.util.Stack;

public class Sort_Stack{

    public static void sorting(Stack<Integer> stack1) {
        Stack<Integer> stackResult = new Stack<Integer>();

        while (!stack1.isEmpty()) {
            int temp = stack1.pop();
            while (!stackResult.isEmpty() && temp < stackResult.peek()) {
                stack1.push(stackResult.pop());
            }
            stackResult.push(temp);
        }

        while (!stackResult.isEmpty()) {
            stack1.push(stackResult.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack before sorting: " + stack);
        sorting(stack);
        System.out.println("Stack after sorting: " + stack);
    }
}
