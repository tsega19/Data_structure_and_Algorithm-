import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Creating a stack data structure using the Stack class from Java's util package
        Stack<String> stack = new Stack<String>();

        // Pushing elements onto the stack
        stack.push("hello");
        stack.push("world");
        stack.push("this");
        stack.push("is");
        stack.push("data");

        // Removing the top element from the stack
        stack.pop();

        // Retrieving the top element from the stack without removing it
        System.out.println(stack.peek());

        // Printing the contents of the stack
        System.out.println(stack);

        // Searching for an element in the stack and printing its position
        // Note: The position is indexed from 1 (1-based index)
        // Returns -1 if the element is not found
        System.out.println(stack.search("is"));
        System.out.println(stack.search("data"));
    }

}
            //Stack
            //stack = LIFO data structure. Last-In First-Out
            //stores objects into a sort of "vertical tower"
            // push() to add to the top
            //pop() to remove from the top
            // Example uses of stacks:
            // 1. Undo/redo features in text editors
            // 2. Moving back/forward through browser history
            // 3. Backtracking algorithms (maze, file directories)
            // 4. Calling functions (call stack)

