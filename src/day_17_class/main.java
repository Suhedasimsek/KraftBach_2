package day_17_class;

import javax.swing.text.html.ImageView;

public class main {
    public static void main(String[] args) {

      /*  Person ogrenci1=new Person();
        ogrenci1.isim="İbrahim";
        ogrenci1.cinsiyet= "erkek";
        ogrenci1.yas=42;
        ogrenci1.oyunOyna();
        ogrenci1.uyu();


        Person ogrenci2=new Person();
        ogrenci2.isim="Şüheda";
        ogrenci2.cinsiyet= "kız";
        ogrenci2.yas=38;

        System.out.println(ogrenci1.isim+ " ile " + ogrenci2.isim+ " arkadaştır.");


  Dog dog_1=new Dog();
  dog_1.isim="Karabas";
  dog_1.cins="Kangal";

        System.out.println(dog_1.isim+ " adlı köpeğin rengi "+ dog_1.renk);

        dog_1.uyu();
        dog_1.havla();
        System.out.println(dog_1.ye());


        Car tesla_1=new Car();
        tesla_1.hiz=360;
        tesla_1.renk= "mavi";
        tesla_1.marka="tesla";
        tesla_1.model="model_3";
        tesla_1.calis();
        tesla_1.hızlan();
        tesla_1.dur();
        System.out.println(tesla_1.model);*/


//
//        Daire daire_1=new Daire();
//        daire_1.cap=4;
//        System.out.println(daire_1.alanHesap());
//
//        Daire daire_2=new Daire();
//        daire_2.cap=7;
//        System.out.println(daire_2.cevre());
//
//
//        double c=daire_1.alanHesap();
//        System.out.println("c = " + c);
//
//
//        System.out.println("Math_2.pow(2,7) = " + Math_2.pow(2, 7));
        Banka person_1=new Banka();
         person_1.hesapAc();
         person_1.mobilBankacılıkOnay();
         person_1.paraYatir(199);
         person_1.paraYatir(200);
        System.out.println(person_1.paraMiktarı);

    }
}
