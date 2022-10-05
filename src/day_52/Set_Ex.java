package day_52;

import java.util.HashSet;
import java.util.Set;

public class Set_Ex {
    public static void main(String[] args) {


        Set<Integer> set= new HashSet<>();
       set.add(13);
       set.add(23);
       set.add(13);
       set.add(33);
       set.add(43);
       set.add(43);
        System.out.println(set);


    }
}
