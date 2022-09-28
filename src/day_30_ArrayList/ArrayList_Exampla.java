package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Exampla {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet"); names.add("Mehmet"); names.add("Zehra"); names.add("Ayşe");
        System.out.println("names.size = " + names.size());
        System.out.println("names = " + names);
        names.set(2, "Fatma");
        System.out.println("names = " + names);

        names.add(2,"İnci");
        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());

        System.out.println("names.isEmpty() = " + names.isEmpty());

        names.clear();
        System.out.println("names.isEmpty() = " + names.isEmpty());

boolean isEmpty= names.size()==0;
        System.out.println(+ names.size() == 0);
        System.out.println("isEmpty = " + isEmpty);

    }

}