package day_53_Map;

import java.util.*;

public class mapExMain {
    public static void main(String[] args) {

            Map<Integer,Ogrenci> okul=new TreeMap<>();

            Ogrenci ogr1=new Ogrenci("mehmet","yılmaz",63);
            Ogrenci ogr2=new Ogrenci("ahmet","şen",79);
            Ogrenci ogr3=new Ogrenci("enes","çelik",56);
            Ogrenci ogr4=new Ogrenci("adem","aslan",90);

            okul.put(438,ogr4);
            okul.put(544,ogr3);
            okul.put(765,ogr2);
            okul.put(439,ogr1);
            okul.put(125,new Ogrenci("harun","yıldırım",10));
        System.out.println(okul.get(439).getAverageNote());

        System.out.println(okul.get(25).getSurName());

        List<Ogrenci> list=new ArrayList<>();
        list.add(ogr1);
        list.add(ogr2);
        list.add(ogr3);
        list.add(ogr4);

        System.out.println(list.get(0).getAverageNote());

    }
}
