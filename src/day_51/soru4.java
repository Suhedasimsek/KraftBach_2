package day_51;

import day_45.İnterface.A;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class soru4 {
    public static void main(String[] args) {

        String [] array={"Asım", "Arzu", "İnci","Şüheda"};
        List<String> list=new ArrayList<>(Arrays.asList(array));
      //  System.out.println(isimSil(list, "Şüheda"));
        System.out.println(isimSil2(list,"Asım"));

    }
    //içerisinde " mehmet" olan tüm isimleri silin

    public static List<String> isimSil (List<String> list, String data){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(data)){
                list.remove(list.get(i));
            }
            
        }return list;


    }
    public static List<String> isimSil2 (List<String> list, String data){
        Iterator<String> myIter=list.iterator();
       while (myIter.hasNext()){
           if (myIter.next().equals(data)){
               myIter.remove();
           }
       }return list;

        }

    }



