import java.util.Stack;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    // O(1)
    public void push(int x) {
        input.push(x);
    }
    
    // Amortizado O(1)
    public int pop() {
        peek(); // Garante que a pilha 'output' tenha o elemento correto no topo
        return output.pop();
    }
    
    // Amortizado O(1)
    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    // O(1)
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}