package day_14Methods;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        // aritmetic ();
        //max();
        //okka();
        //numara(5);
        //message();
        // message5("perşembe",11);
        //yasHesap(1984);
        // üs(2, 5);
        // topla(4,8);
        hesapMakine(5, 7, "*");


    }

    public static void message() {
        System.out.println("hello world");

    }


    public static void aritmetic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ortalama için üç sayı giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        int sayi3 = sc.nextInt();

        System.out.println("ortalama= " + ((sayi1 + sayi2 + sayi3) / 3) + "dır.");

    }


    public static void max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen iki sayıyı giriniz");

        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        int sonuc = sayi1 > sayi2 ? sayi1 : sayi2;
        System.out.println(sonuc);
    }


    public static void okka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen okkaya girilecek kilo miktarını giriniz");

        double kilo = sc.nextDouble();
        double sonuc = kilo / 1.282;
        System.out.println(sonuc + " okkadır.");
    }


    public static void numara(int num) {
        System.out.println(num + "burada");
        System.out.println(num + 3);
    }


    public static void message5(String str, int i) {
        System.out.println("Ayın " + i + "i " + str + "dir.");
    }

    public static void yasHesap(int d) {
        System.out.println(2022 - d);
    }

    public static void üs(int a, int b) {
        double sonuc = Math.pow(a, b);
        System.out.println(sonuc);
    }

    public static void topla(int a, int b) {

        System.out.println(a + " +" + b + " =" + (a + b));
    }

    public static void hesapMakine(int num, int num2, String str) {

        if (str.equals("+")) {
            System.out.print(num + num2);
        } else if (str.equals("-")) {
            System.out.println(num - num2);
        } else if (str.equals("*")) {
            System.out.println(num * num2);
        } else if (str.equals("/")) {
            System.out.println(num / num2);
        } else {
            System.out.println("Matematiksel operator geçerli değil");


        }
    }
}