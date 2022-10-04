package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru3 {
    //List içerisindeki tüm sıfırları listin sonuna yazan methodu yazınız
    public static void main(String[] args) {
        Integer [] array={1,2,3,0,9,0,8,0,7,0,6,0,5};
        List<Integer> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(sıfırlarSona(list));

    }
    public static List<Integer> sıfırlarSona (List<Integer> list){

        int orjinalsize=list.size();
      list.removeAll(Arrays.asList(0));
      int sonSize=list.size();

        int totalSize=orjinalsize-sonSize;

        for (int i = 0; i < totalSize; i++) {
            list.add(0);

        }return list;


    }

    public static List<Integer> sıfırlarSona2 (List<Integer> list){
        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(0)){
                list1.add(list.get(i));
            }

        }
        int totalSize= list.size()-list1.size();

        for (int i = 0; i <totalSize ; i++) {
            list1.add(0);

        }return list1;



    }


}
