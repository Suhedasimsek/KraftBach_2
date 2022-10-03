package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ÖrnekTeach {
    public static void main(String[] args) {


        Integer[] arr1 = {1, 2, 3, 4, 5, 4, 5, 4, 3, 6, 5, 3};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr1));

        // System.out.println(list);
        // System.out.println(removeListMethod3(list,4));
        System.out.println(removeListMethod(list, 5));
//        System.out.println(removeListMethods4(list, 4));
//        System.out.println(removeListMethods4(list, 3));
//        System.out.println(removeListMethods4(list, 2));
    }



    public static boolean removeListMethod3(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }

    public static List<Integer> removeListMethods4(List<Integer> list, Integer data){
        Iterator<Integer> iter=list.iterator();
        while (iter.hasNext()){
            if(iter.next().equals(data)){
                iter.remove();
            }
        }
        return list;

    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)

    public static List<Integer> removeListMethod(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod2(List<Integer> list,Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public static boolean removeListMethod7(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }



    public static List<Integer> removeListMethod8(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod9(List<Integer> list, Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }






}

