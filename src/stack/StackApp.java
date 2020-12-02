package stack;

//(b)   Develop an application to
/*
        (i) insert characters to the stack using push() method
        (ii) Remove the content of stack and display them
        (iii) Comment on the order of insertion to the stack and the order of removal from the stack

 */

public class StackApp {
    public static void main(String[] args){

        //make new Stack
        StackX theStack = new StackX(10);

        //(i)
        //push item on to the stack
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);

        ///(iii) insertion order - 20, 30, 40, 50

        //(ii)
        //until it's empty
        while (!theStack.isEmpty()){

            //delete from the stack
            long value = theStack.pop();

            //display it
            System.out.println(value);
            System.out.print(" ");
        }
        System.out.println(" ");

        ///(iii)50, 40, 30, 20
    }
}
