package day_23;

import java.util.Random;

public class ArraysExampl {
    public static void main(String[] args) {



        /*int[] sayi1 = new int[5];
        sayi1[0] = 5;
        sayi1[1] = 52;
        sayi1[2] = 7;
        sayi1[3] = 98;
        sayi1[4] = 32;



        System.out.println(sayi1[0]);
        System.out.println(sayi1[1] - 22);
        System.out.println(sayi1[2] / 7);
        System.out.println(sayi1[3] * 22);
        System.out.println(sayi1[4] + 5);

        for (int i = 0; i < 5; i++) {
            System.out.println(sayi1[i]);


// for döngüsünde RRy içindeki bütün sayıların karelerini alarak ekrana yazdırın


//        for (int i = 0; i < 5; i++) {
//            System.out.println(sayi1[i] * sayi1[i]);
//


        //haftanın 3. günü çarşamba ise bugün günlerden çarşambadır yaz değilse


//            if (gün[2].equals("çarşamba")) {
//                System.out.println("Haftanın 3. günü çarşambadır");
//            }else {
//                System.out.println("Haftanın 3. günüçarşamba değildir");

//            }
        String[] gün = new String[7];
        gün[0] = "pazartesi";
        gün[1] = "salı";
        gün[2] = "çarşamba";
        gün[3] = "perşembe";
        gün[4] = "cuma";
        gün[5] = "cumartesi";
        gün[6] = "pazar";
        System.out.println("Bugün günlerden " + gün[2]);

       // Günlerin içinde cuma varsa true yoksa false yazdırsın

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (gün[i].contains("cuma")) {
                count++;

            }
        }
        if (count > 0) {
            System.out.println("arrayimin içerisinde "+count+ " tane cuma vardır");
        } else {
            System.out.println(false);
        }

//   Bütün günlerde varmı yokmu göstersin istersem
//        for (int i = 0; i < 7; i++) {
//            if (gün[i].equalsIgnoreCase("cuma")) {
//                System.out.println(true);
//            } else {
//                System.out.println(false);
//            }
//        }



              String[]   isim= {"asım","şüheda","ibrahim","arzu","inci"};// ya da
             // String   isim[]= {"asım","şüheda","ibrahim","arzu","inci"};

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (isim[i].equalsIgnoreCase("şüheda")) {
                count++;

            }
        }
        if (count > 0) {
            System.out.println("isminiz grup içerisinde vardır");
        } else {
            System.out.println("isminiz grup içerisinde yoktur");
        }


        //20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
        //atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın.



       int[] sayı=new int[20];
        Random random=new Random();

        for (int i = 0; i < 20; i++) {

            sayı[i] = random.nextInt(100);
            System.out.println(i+". sayı: "+sayı[i]+"dir");
        }
        System.out.println("17. indexteki sayımız "+sayı[17]);*/


        //arrayimizin içindeki tek ve çift sayıları bulalım


        int[] sayı = new int[20];
        Random random = new Random();
        int tek = 0, çift = 0;
        for (int i = 0; i < 20; i++) {

            sayı[i] = random.nextInt(100);
            System.out.println(i + ". sayı: " + sayı[i] + "dir");

            if (sayı[i] % 2 == 0) {
                çift++;
            } else {
                tek++;
            }

        }
        System.out.println(tek + " tane tek sayı vardır");
        System.out.println(çift + " tane çift sayı vardır");

    }
        }

