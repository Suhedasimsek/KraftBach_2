package day_50_CollectionCont;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Study {
    public static void main(String[] args) {
        Queue<Integer> numQue=new LinkedList<>();//FIFO
numQue.offer(2);
numQue.offer(4);
numQue.offer(6);
numQue.offer(8);
numQue.offer(10);
numQue.offer(12);
        System.out.println(numQue);
        numQue.remove();//ilki siler
        System.out.println(numQue);
        numQue.peek();//ilki gösterir
        System.out.println(numQue);

        System.out.println("..............");
        while (!numQue.isEmpty()){
            System.out.print(numQue.poll());//gösterecek silecek
            System.out.println("--->");
            System.out.println(numQue.peek());//ilki gösterir
        }
        System.out.println(numQue);
        //System.out.println(numQue.element());// boşsa exeption
   //     System.out.println(numQue.poll());//boşsa null
        System.out.println(numQue.remove());//boşsa exeption

    }
}
