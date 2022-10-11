package day_54_collc;

import javax.naming.Name;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable {
    public static void main(String[] args) {
        NavigableSet<Integer> intSortedSet = new TreeSet<>();
        intSortedSet.add(10);
        intSortedSet.add(60);
        intSortedSet.add(50);
        intSortedSet.add(70);
        intSortedSet.add(40);
        intSortedSet.add(30);
        intSortedSet.add(90);
        System.out.println(intSortedSet);
        System.out.println(intSortedSet.lower(40));//sayının altındakini veriyor
        System.out.println(intSortedSet.higher(30));// sayının üstündekini veriyor
        System.out.println(intSortedSet.floor(30));//alt değerini döndürüyor aynısı varsa aynısını TABAN
        System.out.println(intSortedSet.floor(36));
        System.out.println(intSortedSet.ceiling(30));
        System.out.println(intSortedSet.ceiling(36));//ÜST değerini döndürüyor aynısı varsa aynısını TAVAN

        System.out.println(intSortedSet.first());//ilki verir.Boşsa exeption atar.
        System.out.println(intSortedSet);
        System.out.println(intSortedSet.pollFirst());//ilki verir kaldırır. Boşsa null atar
        System.out.println(intSortedSet);
        System.out.println(intSortedSet.pollLast());// sonu verir kaldırır.
        System.out.println(intSortedSet);
        System.out.println(intSortedSet.descendingSet());
        System.out.println(intSortedSet);

        System.out.println(intSortedSet.subSet(30, true, 70, false));
        System.out.println(intSortedSet.headSet(50, true));// inclusive dahil edip etmemeyi karar veriyor
        System.out.println(intSortedSet.headSet(50, false));
        System.out.println(intSortedSet.tailSet(50, true));
        System.out.println(intSortedSet.tailSet(50, false));

        System.out.println(intSortedSet);

        Iterator<Integer> myIter = intSortedSet.iterator();
        while (myIter.hasNext()) {
            Integer next=myIter.next();
            if (next>= 40) {
                myIter.remove();
            }
            System.out.println(intSortedSet);

        }
    }
}
