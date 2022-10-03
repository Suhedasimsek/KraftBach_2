package day_49;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listİterator_Ex {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>(Arrays.asList(100, 90, 80, 70, 60, 50, 40));
        ListIterator<Integer> listIterator = lst.listIterator(); {
            System.out.println(listIterator.hasNext());


          while (listIterator.hasNext()){
              Integer next= listIterator.next();
              if (next>50){
                  listIterator.remove();
              }
          }
            System.out.println(lst);











        }
    }
}

