package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] array2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println(listReturn(array));
        System.out.println(listReturn2(array2));

    }

    // Bir arrayı listin içine alan ve list return eden bir method yazınız.
    public static List<Integer> listReturn(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);

        }
        return list;
    }

    public static List<Integer> listReturn2(Integer[] array) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(array);
        return list;


    }
}
