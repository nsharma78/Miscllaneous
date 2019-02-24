/*
 * Given a positive integer, return true if it is prime, false otherwise
 */

package main.java;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 11;
        System.out.println("The given number is prime: " + isPrime(n));
    }

    private static boolean isPrime(int n) { // O(sqrt(n)/log(n)) O(1)
        if(n == 2) return true;
        if(n <= 1 || n % 2 == 0)
            return false;

        for(int i = 3; i <= Math.sqrt(n); i = i + 2){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
