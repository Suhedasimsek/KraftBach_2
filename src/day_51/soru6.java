package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru6 {
    public static void main(String[] args) {

       // System.out.println(Palindrom("kayak"));
        List<String> list=new ArrayList<>(Arrays.asList("kayak", "ayak", "ebe", "ayşe","Fatma","abba"));
        System.out.println(sil(list));


    }

    public static List<String> sil (List<String> list){
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(palindromKelime(list.get(i)))){
                list.remove(list.get(i));}
        }return list;
    }


public static String palindromKelime (String str){
        String result="";
    for (int i = str.length()-1; i >=0 ; i--) {
      result+= str.charAt(i);

    }return result;
}








    public static boolean Palindrom(String str) {

        String strReverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
            strReverse += str.charAt(i);
        if (strReverse.equals(str)) {
            System.out.println("Bu kelime palindrom bir kelimedir");
            return true;
        } else {
            System.out.println("Bu kelime palindrom bir kelime değildir");
            return false;
        }

    }




}

