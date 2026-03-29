//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);
        myStack.push(2);
        myStack.push(3);
        myStack.pop();
        myStack.printStack();
        Queue myqueue = new Queue(3);
        myqueue.enqueue(4);
        myqueue.enqueue(5);
        myqueue.printqueue();

    }
}