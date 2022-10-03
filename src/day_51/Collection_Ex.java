package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_Ex {
    public static void main(String[] args) {
        // Bir arrayı listin içine alan ve list return eden bir method yazınız.
        Integer arr2[] = {1, 2, 3, 4, 5};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr2));
        //  System.out.println("listDöndür() = " + listDöndür(arr2));
        // List<Integer> list=new ArrayList<>(listDöndür(arr2));
        // System.out.println(listDöndür2(arr2));
       // System.out.println(soru2_2(list, 3));

    }

//    public static List<Integer> listDöndür(int[] arr) {
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//        return list;
//    }

//    public static List<Integer> listDöndür2(Integer[] arr) {
//        List<Integer> list = new ArrayList<>();
//        list = Arrays.asList(arr);
//        return list;

//içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen sonucunda
// bir Integer list döndüren methodu yazınız.


    public static List<Integer> soru2_2(List<Integer> list, Integer data) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i).equals(data)){
                list2.remove(data);
            }

        }return list2;
    }

    //listn içindeki bütün sıfırları listin sonuna yazan method yazınıs

    public static List<Integer> MoveAllZero (List<Integer> list){
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i).equals(0)){
                list3.remove(i);
            }

        }int totalSize=list.size()-list3.size();
        for (int i = 0; i <totalSize ; i++) {
            list3.add(0);

        }return list3;
    }

    }

//List içerisindeki palindrom kelimeleri list içerisinden silen methodu yazınız.
