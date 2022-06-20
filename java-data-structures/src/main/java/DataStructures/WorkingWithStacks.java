package DataStructures;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
 //     see the last item in the stack
        System.out.println(stack.peek());

        System.out.println(stack.size());
 //     same as peek but removes the last item from the stack
        System.out.println(stack.pop());
        System.out.println(stack.size());
//      check if the stack is empty(boolean)
        System.out.println(stack.empty());
    }
}
