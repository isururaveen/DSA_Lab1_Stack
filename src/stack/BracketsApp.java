package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[]args) throws IOException {

        String input;
        while (true){
            System.out.print("Enter String containing delimiters: ");
            System.out.flush();

            //read a String from kbd
            input = getString();

            //quit if [Enter]
            if (input.equals(""))
                break;

            //make a BracketChecker
            BracketChecker theChecker = new BracketChecker(input);

            //Check brackets
            theChecker.check();

        }
    }

    private static String getString() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
