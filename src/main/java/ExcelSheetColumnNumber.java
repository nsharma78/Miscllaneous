/*
 * Given a column title as appear in an Excel sheet, return its corresponding column number. For example:
 *  A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
    ...
    AAA -> 703
 */

package main.java;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String input = "AAA";
        System.out.println("Column number for the given string is: " + getNumber(input));
    }

    private static int getNumber(String input) { // O(n) O(1)
        if(input == null || input.isEmpty())
            return 0;

        int num = 0;
        char[] arr =input.toCharArray();
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            num = num + (int)Math.pow(26, i) + (arr[i] - 'A');
        }

        return num;
    }
}
