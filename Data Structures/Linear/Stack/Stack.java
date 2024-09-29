class StackStructure {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackStructure(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // isEmpty operation
    public boolean isEmpty() {
        return (top == -1);
    }

    // Size operation
    public int size() {
        return top + 1;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackStructure stack = new StackStructure(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());

        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
    }
}
