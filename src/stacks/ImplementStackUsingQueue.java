package stacks;

import java.util.Stack;

public class ImplementStackUsingQueue<T> {

    Stack<T> firstStack;
    Stack<T> secondStack ;

    public ImplementStackUsingQueue(){
        this.firstStack = new Stack<>();
        this.secondStack = new Stack<>();
    }

    public void push(T x) {
        while (!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }
        firstStack.push(x);
        while (!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }

    }

    public T pop() {
        return firstStack.pop();

    }

    public T peek() {
        return firstStack.peek();

    }

    public boolean empty() {
        return firstStack.isEmpty();

    }

}
