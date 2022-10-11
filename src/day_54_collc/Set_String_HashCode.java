package day_54_collc;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set_String_HashCode {
    public static void main(String[] args) {
        System.out.println(new String("Şüheda").hashCode());
        System.out.println("Şüheda".hashCode());

        Set<String> stringSet =new HashSet<>();
        stringSet.add("Asım");
        stringSet.add("İnci");
        stringSet.add("Arzu");
        stringSet.add("İnci");
        stringSet.add("Asım");
        System.out.println("stringSet = " + stringSet);// Referansı aynı olanları almadı

        student s1=new student("Arzu",23);
        student s2=new student("Arzu",23);
        student s3=new student("Arzu",23);


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.equals(s2));

        Set<Object> studentSet=new HashSet<>();
       studentSet.add(s1);
       studentSet.add(s2);
       studentSet.add(s3);

      //  System.out.println(studentSet);
        System.out.println(studentSet.size());


    }
}
