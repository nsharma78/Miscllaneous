/*
 * Given a boolean expression with following symbols.
Symbols
    'T' ---> true
    'F' ---> false
Operators
    &   ---> boolean AND
    |   ---> boolean OR
 * Given a string with these symbol evaluate the boolean expression represented by the string
 * Ex
 * T|F|T&F is true as if there is || after true it short circuits it to true
 * F|T&T|F&T is true
 * F|T&F|T&F is false
 */

package main.java;
import java.util.*;

public class EvaluateBooleanExpression {

    public static void main(String[] args) {
        String input = "F|T&F|T&F";
        System.out.println("Result: " + evalBoolean(input));
    }

    private static boolean evalBoolean(String input) {
        if(input == null || input.isEmpty())
            return true;

        char[] arr = input.toCharArray();

        if(arr[0] != 'T' && arr[0] != 'F')
            return false;

        boolean result = (arr[0] == 'T') ? true : false;

        for(int i = 1; i < arr.length - 1; i = i + 2) {
            switch(arr[i]) {
                case '|':
                    if(result)
                        return result;
                    if(arr[i + 1] != 'T' && arr[i + 1] != 'F')
                        throw new IllegalArgumentException("Invalid input");
                    result = result || (arr[i  + 1] == 'T') ? true : false;
                    break;
                case '&':
                    if(!result)
                        return result;
                    if(arr[i + 1] != 'T' && arr[i + 1] != 'F')
                        throw new IllegalArgumentException("Invalid input");
                    result = result && (arr[i  + 1] == 'T') ? true : false;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");
            }


        }

        return result;
    }
}
