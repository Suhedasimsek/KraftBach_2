package day_54_collc;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Set_InterfaceStudy {
    public static void main(String[] args) {
        Set<Long> longSet=new HashSet<>();
        longSet.add(7l);
        longSet.add(7l);
        longSet.add(70l);
        longSet.add(70l);
        System.out.println(longSet);
    }
}
