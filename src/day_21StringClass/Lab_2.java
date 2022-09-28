package day_21StringClass;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
       // ilk3();
        //System.out.println(ilkÜç("elf"));
        //System.out.println(boslukKaldır("Ayşe ile Ali"));
        //System.out.println(ikinciYarı("fısıldamak"));
       // System.out.println(changeWord("sadaka", "a", "e"));
       // System.out.println(herHarf3("ayşe"));
       // System.out.println(harfSayısı("Ankara", "a"));
       // System.out.println(kelimeSayısı("Ankaran", "an"));
       // System.out.println(harfCıkar("ankara", "a"));
        System.out.println(control("ankarankaran", "ank"));
    }

    //Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 kelimeden az
    //ise inputu döndüren bir metot yazınız.

    public static void ilk3 (){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String message= scan.nextLine();
        if (message.length()>3){
            System.out.println(message.substring(0, 3));
        }else {
            System.out.println(message);
        }

        }

        public static String ilkÜç(String str) {
        if (str.length()<3){
            return str;
        }else {
            return str.substring(0, 3);
        }

        }

//    Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
//    Merhaba dünya  Merhaba%dünya


public static String boslukKaldır (String str){
        if (str.contains(" ")) {
            return str.replace(" ","%");
        }return str;
    }

//    Kullanıcın girdiği  "iki yarısı eşit uzunlukta" bir kelimenin 2. yarısını döndüren bir program
//    yazdırın.

    public static String ikinciYarı (String str){
        return str.substring(str.length()/2);
    }

//    Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//    alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
//yazınız.
//        (Merhaba ,a, e) Merheba
//            (Kasaba , a, i) Kisaba

    public static String changeWord (String str,String old, String new1){
        return str.replaceFirst(old,new1);
    }

    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    public static String herHarf3 (String str){
        String result=" ";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j < 3; j++) {
                result=result+str.substring(i,i+1);
            }

        } return result;
    }
//    Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
//    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
//    edilecek)

    public static int harfSayısı (String str, String target){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if( str.substring(i,i+1).equalsIgnoreCase(target)) {
                count++;
            }
        }
           return count;
        }

//        KKullanıcıdan 2 kelime alın.
//    İkinci kelimenin ilk kelimede kaç adet bulunduğunu yazdıran programı yazınız.
//    Küçük büyük dikkate almasın.

    public static int kelimeSayısı (String str, String target){
        int count=0;
        for (int i = 0; i <str.length()-(target.length()-1) ; i++) {
            if( str.substring(i,i+target.length()).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }


    public static String harfCıkar (String str, String harf){
        return str=str.replace(harf, "");
    }

    public static  boolean control (String str, String control){
       if (str.substring(0,control.length()).equalsIgnoreCase(control) ||
               str.substring(1,1+control.length()).equalsIgnoreCase(control)){
       return true;
       }return false;
    }








    }


