/*
 * Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21…
	Examples:
	Input : 3
	Output : 6
	Input : 4
	Output : 10
 */

package main.java;

public class FindNthInSeries {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th number in the series is: " + findNth(n));
    }

    private static int findNth(int n) { // O(n) O(1)
        if(n <= 1)
            return 1;
        return n * (n + 1)/2;
    }
}
