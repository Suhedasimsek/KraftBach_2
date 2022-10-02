package day_49;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
       List<Integer> lst =new LinkedList<>(Arrays.asList(3,4,5,6,7,8,9));
        System.out.println(lst);
        System.out.println(lst.get(0));
        lst.add(11);
        System.out.println(lst);
        lst.add(0, 20);
        System.out.println(lst);
        lst.set(1,22);
        System.out.println(lst);
        System.out.println(lst.indexOf(22));
        System.out.println(lst.indexOf(33));
        lst.remove(2);
        System.out.println(lst);
        lst.addAll(Arrays.asList(24,42,25,52));
        System.out.println(lst);
        lst.addAll(2,Arrays.asList(44));
        System.out.println(lst);
        lst.sort(null);//boş da metod işler
        System.out.println(lst);
        lst.sort(Comparator.naturalOrder());//sırala
        System.out.println(lst);
        lst.sort(Comparator.reverseOrder());// tersine sırala
        System.out.println(lst);
        System.out.println(lst.subList(2, 6));
        List<Integer> subList3_8=lst.subList(3,8);
        System.out.println(subList3_8);
        System.out.println(lst);//sublist görmem listi değiştirmedi
        subList3_8.set(1, 555);
        System.out.println(subList3_8);//ama sublistte değişiklik yapmam listi değiştirdi
        lst.set(5,556);
        System.out.println(lst);
        System.out.println(subList3_8);
    }
}
