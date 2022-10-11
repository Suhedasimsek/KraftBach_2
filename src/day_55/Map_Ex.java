package day_55;

import java.util.*;

public class Map_Ex {
    public static void main(String[] args) {
        Map<String,Integer> ageMap=new HashMap<>();
        ageMap.put("Asım",7);
        ageMap.put("Arzu",14);
        ageMap.put("İnci",11);
        ageMap.put("Ayşe",12);
        ageMap.put("Zeynep",21);
        ageMap.put("Hatice",22);
        ageMap.put("Fatıma",23);
        ageMap.put("Sümeyye",33);

        Set<String> stringSet=new HashSet<>();
        stringSet=ageMap.keySet();
        //yukarısı şöyyle de yazılabilir Set<String> stringSet=ageMap.keySet
        System.out.println("stringSet = " + stringSet);

       /* Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (ageMap.get(next)>21){
                iterator.remove();
            }
        }
        System.out.println("ageMap = " + ageMap);

        for (String  eachKey:stringSet) {
            System.out.println(eachKey + "---->" + ageMap.get(eachKey));

        */

            Collection<Integer> values = ageMap.values();
            System.out.println("values = " + values);

            Iterator<Integer> iterator1 = values.iterator();
            while (iterator1.hasNext()){
                Integer next = iterator1.next();
                if (next>21){
                    iterator1.remove();
                }
            }
            System.out.println("values = " + values);

        Set<Map.Entry<String, Integer>> entries = ageMap.entrySet();
        for (Map.Entry<String, Integer> eachEntries: entries) {
            System.out.println(eachEntries.getKey() + "--->" + eachEntries.getValue());

        }



    }


    }

