package day_50_CollectionCont;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Study {
    public static void main(String[] args) {
        Deque<Integer> deq=new ArrayDeque<>();
        deq.push(10);
        deq.push(20);
        deq.push(30);
        deq.push(40);
        deq.push(50);
        deq.push(60);

        System.out.println("deq = " + deq);
        deq.offerFirst(11);
        deq.offerLast(22);
        System.out.println("deq = " + deq);
        deq.addFirst(15);
        deq.addLast(25);
        System.out.println("deq = " + deq);
        deq.pop();
        System.out.println("deq = " + deq);


    }
}
