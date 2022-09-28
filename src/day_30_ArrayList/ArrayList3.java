package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Mehmet");
        names.add("Ayşe");
        names.add("Fatma");
        names.add("Burcu");
        names.add("Şüheda");
        names.add("Arzu");
        names.add("İnci");

        System.out.println("names.size() = " + names.size());

        for (String str: names) {
            System.out.print(str+" ");
        }
        System.out.println();
        for (int i = 0; i <names.size() ; i++) {
            System.out.print(names.get(i)+" ");
        }
        System.out.println();
        int Arzu=names.indexOf("Arzu");
        System.out.println("indexofArzu = " + Arzu);

names.add("Zeren");
        System.out.println(names);
names.add("İnci");
        names.set(3,"zeynep");
        System.out.println(names);

        System.out.println(names.indexOf("İnci"));
        System.out.println(names.lastIndexOf("İnci"));

        names.remove("İnci");
        System.out.println(names);
        names.remove(8);
        System.out.println(names);

    }










    }

