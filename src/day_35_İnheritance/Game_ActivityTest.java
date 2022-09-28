package day_35_İnheritance;

import java.util.Scanner;

public class Game_ActivityTest {
    public static void main(String[] args) {
        //Kullanıcıdan kaç hedefle karşılaştığını ve kaçını
        //vurduğunu alın.Rankinizi öğrenin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Kaç hedefle karşılaştın");
        int hedef=sc.nextInt();
        System.out.println("Kaçını vurdun");
        int isabet=sc.nextInt();

        Challenge ch=new Challenge(hedef,isabet);
        System.out.println(ch.getRank());
        System.out.println(ch.getScore());

    }
}
