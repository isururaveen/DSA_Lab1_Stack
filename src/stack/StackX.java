package stack;

//Lab Question
//(a)   Implement stack class to store characters. Identify the data members required and implement the below methods with the constructor
    //push(),  pop(), Peek(),  isEmpty(),  isFull()

public class StackX {

    private int maxSize;    //size of stack array
    private long[] stackArray;
    private int top;        //top of the stack

    //Constructor
    public StackX(int s){

        maxSize = s;        //set array size
        stackArray = new long[maxSize]; //create array
        top = -1;
    }

    //put item on top of the stack
    public void push(long j){

        //Increment top, insert item
        stackArray[++top] = j;
    }

    //take item from top of the stack
    public long pop(){

        //access item, decrement top
        return stackArray[top--];
    }

    //peek at top of stack
    public long peek(){

        return stackArray[top];
    }

    //true if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }

    //true if stack is full
    public boolean isFull(){
        return (top == maxSize -1);
    }
}
