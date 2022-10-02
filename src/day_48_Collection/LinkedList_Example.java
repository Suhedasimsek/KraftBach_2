package day_48_Collection;

import java.util.LinkedList;

public class LinkedList_Example {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("arzu");
        linkedList.add("inci");
        linkedList.add("asım");
        linkedList.add("zeynep");

        System.out.println(linkedList.size());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.pop());//remove gibi gösterdi ama kaldırdı
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));

    }
}
