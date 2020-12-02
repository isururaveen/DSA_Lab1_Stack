package stack;

public class BracketChecker {

    private String input;           //input string

    public BracketChecker(String in){
        input = in;
    }

    public void check(){

        //get max size of the stack
        int stackSize = input.length();

        //make stack
        Stack theStack = new Stack(stackSize);

        //get char in turn
        for (int j = 0; j < input.length(); j++){

            //get char
            char ch = input.charAt(j);
            switch (ch){
                //opening symbols
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);      //push item
                    break;

                    //closing symbols
                case '}':
                case ']':
                case  ')':

                    //if stack not empty
                    if (!theStack.isEmpty()) {

                        //pop and check
                        char chx = theStack.pop();

                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != ')'))
                            System.out.println("Error : " + ch + " at " + j);
                        }
                    else        //prematurely empty
                            System.out.println("Error : " + ch + " at " + j);
                    break;

                default:            //no action on other characters
                    break;

            }
        }
        //at this point, all characters have been processed
        if (!theStack.isEmpty())
            System.out.println("Error: missing right delimiter");
    }
}
