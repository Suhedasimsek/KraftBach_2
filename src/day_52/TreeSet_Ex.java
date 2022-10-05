package day_52;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Ex {
    public static void main(String[] args) {
        Integer [] arr={1,2,3,4,8,9,7,66,55,44,33};
        Set<Integer> Hashset=new HashSet<>(Arrays.asList(arr));
        Set<Integer> Treeset=new TreeSet<>(Arrays.asList(arr));
        System.out.println(Hashset);
        System.out.println(Treeset);
    }
}
