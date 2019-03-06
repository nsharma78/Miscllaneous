/*
Given a Stack, keep track of the maximum value in it. The maximum value may be the top element of the stack, but once a new element is pushed or an element is pop from the stack, the maximum element will be now from the rest of the elements.

Examples:

Input : 4 19 7 14 20
Output : Max Values in stack are
         4 19 19 19 20

Input : 40 19 7 14 20 5
Output :  Max Values in stack are
         40 40 40 40 40 40
 */

package main.java;
import java.util.*;

public class StackMaxElem {

    Stack<Integer> one;
    Stack<Integer> two;

    public StackMaxElem() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void push(int i) { //O(1)
        if(one.isEmpty()) {
            one.push(i);
            two.push(i);
            return;
        }
        one.push(i);
        if(i > two.peek())
            two.push(i);
    }

    public int pop() { //O(1)
        if(one.peek()  == two.peek()) {
            two.pop();
        }
        return one.pop();
    }

    public boolean empty() { //O(1)
        return one.isEmpty();
    }

    public int getMax() { //O(1)
        return two.peek();
    }

    public static void main(String[] args) {
        StackMaxElem s = new StackMaxElem();
        System.out.println("Is Stack Empty: " + s.empty());
        s.push(10);
        System.out.println("Max: " + s.getMax());
        s.push(8);
        s.push(6);
        s.push(4);
        System.out.println("Max: " + s.getMax());
        s.push(11);
        System.out.println("Max: " + s.getMax());
        s.pop();
        System.out.println("Max: " + s.getMax());
        s.push(10);
        System.out.println("Max: " + s.getMax());
        System.out.println("ISStack Empty: " + s.empty());
    }
}
