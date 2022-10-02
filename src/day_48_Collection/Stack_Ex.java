package day_48_Collection;

import java.util.Stack;

public class Stack_Ex {
    public static void main(String[] args) {

        Stack<Object> stack=new Stack<>();
        stack.add(2);
        stack.add("asım");
        stack.add(true);
        stack.add(4.4);

        System.out.println(stack.size());
        System.out.println(stack.pop());//LIFO yığının en altındakini alır
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());// sonuncuyu getirir ama silmez size değiştirmz
        System.out.println(stack.size());
        System.out.println(stack.push("ayşe"));// döndürür ve en üste ekler
        System.out.println(stack.size());
        System.out.println(stack.search(2));//verilen nesne kaçıncı


    }
}
