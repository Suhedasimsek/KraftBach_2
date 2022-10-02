package day_49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collection_Study {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        Collection<Integer> arr3=new ArrayList<>();
        arr3.add(15);arr3.add(25);arr3.add(35);
//        System.out.println(arr3);
//        System.out.println(arr3.size());
//        System.out.println(arr3.remove(15));
//        System.out.println(arr3);
//        System.out.println(arr3.remove(95));
//        System.out.println(arr3.contains(35));
//        System.out.println(arr3.isEmpty());
//        arr3.removeAll(arr3);
//        System.out.println(arr3);
//        arr3.addAll(Arrays.asList(60,70,80,90));// Arrays.asList collectiona gerek olmadan değer ekler çıkarır
//        System.out.println(arr3);
//        System.out.println(arr3.containsAll(Arrays.asList(60,70)));
//        arr3.retainAll(Arrays.asList(80,200));// Listede olanı alır gerisini atar. Olmayanı görmez.
//        System.out.println(arr3);

        Integer[] toArray = arr3.toArray(new Integer[4]);//[0] yerine fazla girersek null az girersek fazlanın hepsini gsterir
        System.out.println(Arrays.toString(toArray));


    }
}
