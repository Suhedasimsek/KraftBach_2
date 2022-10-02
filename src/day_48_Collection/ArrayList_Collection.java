package day_48_Collection;

import java.util.ArrayList;

public class ArrayList_Collection {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();

arrayList.add("mehmet");
arrayList.add("ahmet");
arrayList.add("arzu");
arrayList.add("inci");
arrayList.add("mehmet");

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("mehmet");
        arrayList2.add("ahmet");

        System.out.println(arrayList.size());
        arrayList.add(2,"Asım");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("inci"));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.isEmpty());
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);


    }

    }
