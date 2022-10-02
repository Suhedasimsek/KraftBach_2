package day_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll=new ArrayList<>(Arrays.asList(22,33,44,55,66));
      //  for (Integer each:cll) {
      //      System.out.print(each+" ");
     //       }

      //  System.out.println();
        Iterator<Integer> myIter = cll.iterator();
        /*
        System.out.println(myIter.next());// ilk sayıyı ele alıyor
        myIter.remove();//next yapılan değeri çıkarıyor.
        System.out.println(cll);
        System.out.println(myIter.next());
        myIter.remove();//remove için next gerekli yoksA hata verir
        System.out.println(cll);

         */

        while (myIter.hasNext()){
            Integer next = myIter.next();
            System.out.println(next);
            if (next>33){
                myIter.remove();
            }

        }System.out.println(cll);
        cll.add(200);
        System.out.println(myIter.hasNext());
        System.out.println(cll);

    }
    }
