package structure;

import java.util.Stack;

public class StackExample {
    public static void stackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(15);
        stack.add(20);
        stack.add(25);

        System.out.println("pop");
        System.out.println(stack.pop());
        System.out.println("peek");
        System.out.println(stack.peek());
        System.out.println("push");
        System.out.println(stack.push(35));

        System.out.println("stream");
        stack.stream().forEach(System.out::println);
    }
}
