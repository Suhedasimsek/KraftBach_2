package day_53_Map;

import day_45.İnterface.A;

import java.util.*;

public class map_Ex {
    public static void main(String[] args) {

        Map<Integer, String> fenA=new HashMap<>();
        fenA.put(11,"Asım");
        fenA.put(22,"İnci");
        fenA.put(33,"Arzu");
        fenA.put(44,"Şüheda");
        System.out.println(fenA.get(33));
        System.out.println(fenA.size());
        System.out.println(fenA);
        System.out.println(fenA.containsKey(11));
        System.out.println(fenA.remove(22));
        System.out.println(fenA);
        System.out.println(fenA.containsValue("Asım"));
        System.out.println(fenA.keySet());
        System.out.println(fenA.values());



        Map<Integer, String> fenB =new LinkedHashMap<>();
        fenB.put(55,"Fatma");
        fenB.put(66,"Ayşe");
        fenB.put(77,"Zeynep");
        fenB.put(88,"Tuba");

        List<Map<Integer,String>> okul=new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);
        System.out.println(okul.size());
        System.out.println(okul);
        System.out.println(okul.toString());

        System.out.println(fenB.get(55));
        System.out.println(okul.get(1).get(55));


    }
}
