import java.util.*;

public class SortStack {

    // Function to insert element in sorted stack
    static void insertSorted(Stack<Integer> stack, int element) {
        // Base case
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top and recurse
        int top = stack.pop();
        insertSorted(stack, element);

        // Push back
        stack.push(top);
    }

    // Function to sort stack using recursion
    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt(); // number of elements

        while (n-- > 0) {
            stack.push(sc.nextInt());
        }

        sortStack(stack);
        System.out.println(stack);
    }
}
