package day_55;

import java.util.HashMap;
import java.util.Map;

public class Map_Metods {
    public static void main(String[] args) {

        Map<String,Integer>  ageMap=new HashMap<>();
        ageMap.put("Asım",7);
        ageMap.put("Arzu",14);
        ageMap.put("İnci",11);
        ageMap.put("Asım",12);//dublicate kabul etmiyor son girilen değere güncelledi
        System.out.println(ageMap);

        System.out.println("ageMap.get(Asım) = " + ageMap.get("Asım"));//Integer değer döndürüyor value değerini
        System.out.println("ageMap.size() = " + ageMap.size());
        System.out.println("ageMap.containsValue(14) = " + ageMap.containsValue(14));//boolean
        System.out.println("ageMap.containsKey(\"Arzu\") = " + ageMap.containsKey("Arzu"));//boolean
        System.out.println("ageMap.remove(\"İnci\") = " + ageMap.remove("İnci"));//gösterir ve kaldırır
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.remove(\"Alya\",43) = " + ageMap.remove("Alya", 43));//boolean
        Map<String,Integer>  ageMap2=new HashMap<>();
        ageMap2.put("Zeynep",21);
        ageMap2.put("Hatice",22);
        ageMap2.put("Fatıma",23);
        ageMap2.put("Sümeyye",null);
        System.out.println("ageMap2 = " + ageMap2);
        ageMap.putAll(ageMap2);
        System.out.println("ageMap = " + ageMap);  ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2);
        System.out.println("ageMap = " + ageMap);//ageMap2 silndi ama bu map değişmedi
        System.out.println("ageMap.putIfAbsent(\"Fatıma\",24) = " + ageMap.putIfAbsent("Fatıma", 24));
        System.out.println("ageMap.putIfAbsent(\"Sümeyye\", 24) = " + ageMap.putIfAbsent("Sümeyye", 24));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(\"Asım\", 28) = " + ageMap.replace("Asım", 28));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(\"Fatıma\",23,29) = " + ageMap.replace("Fatıma", 23, 29));
        System.out.println("ageMap = " + ageMap);
        System.out.println("ageMap.replace(\"Fatıma\",24,30) = " + ageMap.replace("Fatıma", 24, 30));
        System.out.println("ageMap = " + ageMap);


    }
}
