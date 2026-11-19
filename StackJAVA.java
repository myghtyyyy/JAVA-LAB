interface Stack {
    void push(int value);
    int pop();
}

class StackOperations implements Stack {

    int[] stack = new int[5];
    int top = -1;

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }
}

public class StackJAVA {
    public static void main(String[] args) {

        StackOperations s = new StackOperations();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Popped element: " + s.pop());
        System.out.println("Popped element: " + s.pop());
    }
}