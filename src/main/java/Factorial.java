/*
 * Given a  number n return its factorial
 * fact(5) = 5 * 4 * 3 * 2 * 1;
 * fact(3) = 3 * 2 * 1
 * fact(0) = 1;
 *
 */

package main.java;

public class Factorial {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("The factorial of " + n + " is: " + factIterative(n));
        System.out.println("The factorial of " + n + " is: " + factRecursive(n));
    }

    private static double factIterative(int n) { //O(n) O(1)
        double fact = 1.0;
        while(n > 0) {
            fact *= n--;
        }
        return fact;
    }

    private static double factRecursive(int n) { //O(n) O(n)
        if(n <= 1)
            return 1.0;
        else
            return n * factRecursive(n -1);
    }
}
