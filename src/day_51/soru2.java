package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class soru2 {
    public static void main(String[] args) {
        Integer arr2[] = {1, 2, 3, 4, 5};
   List<Integer> list=new ArrayList<>(Arrays.asList(arr2));
//        System.out.println(soru2(list, 5));
       // System.out.println(soru2a(list,3));
       // System.out.println(soru2c(list,4));
//        System.out.println(soru2b(list,1));
//        System.out.println(list);//soru2b methodu için true olan listeyi methodla verilen datayı kaldırarak yazdırdım

    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)

    public static List<Integer> soru2(List<Integer> list, Integer data) {
        Iterator<Integer> myIter = list.iterator();
        while (myIter.hasNext()){
            if(myIter.next().equals(data)){
                myIter.remove(); }
        }return list;
    }
    public static List<Integer>  soru2a (List<Integer> list, Integer data) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(data)){
                list.remove(list.get(i));
            }

        }return list;
    }

    public static boolean soru2b (List<Integer> list, Integer data) {
        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }

    public static List<Integer> soru2c (List<Integer> list, Integer data) {
        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(data)) {
                list2.add(list.get(i));
            }

        }return list2;
    }




}
