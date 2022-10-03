package day_48_Collection;

import java.util.Vector;

public class Vector_Example {
    public static void main(String[] args) {

        Vector<String> vector=new Vector<>();
        System.out.println(vector.capacity());//10 10 artıyor
        System.out.println(vector.size());
        System.out.println(vector.isEmpty());

    }
}
