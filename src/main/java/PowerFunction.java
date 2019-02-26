/*
 * Implement power(x,y)
 * Example
 * power(2,3) = 8, power(5,2) = 25, power(2, -4) = 1/16
 *
 */

package main.java;

public class PowerFunction {

    public static void main(String[] args) {
        int num = 5;
        int pow = -2;
        System.out.println("num raised to pow = " + powerRecursive(num, pow));
        System.out.println("num raised to pow = " + simpleRecursive(num, pow));
        System.out.println("num raised to pow = " + powerIterative(num, pow));
    }

    private static double powerIterative(int num, int pow) { //O(pow) O(1)
        if (pow == 0)
            return 1;

        double result = 1.0;
        boolean isNeg = (pow < 0) ? true : false;

        pow = Math.abs(pow);
        while(pow-- > 0) {
            result = result * num;
        }

        return isNeg ? 1/result : result;
    }

    public static double simpleRecursive(int base,int exponent) { //O(exponent) O(exponent)
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            return 1 / simpleRecursive(base, -exponent);
        }
        else {
            double results = base * simpleRecursive(base, exponent - 1);
            return results;
        }
    }


    private static double powerRecursive(int num, int pow) { // O(powlogn) O(pow)
        if(pow == 0)
            return 1;
        double temp = powerRecursive(num, pow/2);
        if(pow % 2 == 0)
            return temp * temp;
        else {
            if(pow > 0)
                return num * temp * temp;
            else
                return (temp * temp)/num;

        }

    }
}
