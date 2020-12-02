package stack;

//Lab 01 Que (C)
//Use the stack class created above and check whether a user entered expression is
//        correctly parenthesized.
//        Ex: 3 + (( 6 * 2) – 3)  valid
//        5 * 6 + (2 - 5  not valid
public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    //constructor
    public Stack(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    //put items on top of the stack
    public void push(char j){
        stackArray[++top] = j;
    }

    //take item from top of the stack
    public char pop(){
        return stackArray[top--];
    }

    //peek at top of the stack
    public char peek(){
        return stackArray[top];
    }

    //true if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
}
