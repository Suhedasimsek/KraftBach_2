package day_55;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_Ex {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navMap=new TreeMap<>();
        navMap.put(12,"Ali");
        navMap.put(82,"Veli");
        navMap.put(52,"Ayşe");
        navMap.put(42,"Fatma");
        System.out.println(navMap);
        System.out.println(navMap.descendingMap());
        System.out.println(navMap.descendingKeySet());
        System.out.println(navMap.firstEntry());
        System.out.println(navMap.higherKey(23));
        System.out.println(navMap.lowerKey(42));
        System.out.println(navMap.navigableKeySet());
        System.out.println(navMap);


    }
}
