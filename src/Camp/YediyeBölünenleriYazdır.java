package Camp;

import java.util.Scanner;

public class YediyeBölünenleriYazdır {
    public static void main(String[] args) {
        //Verilen sayılar içinde 7ye bölünenleri yazdır
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz");
        int a=sc.nextInt();
        int b=sc.nextInt();


        for (int i = Math.min(a,b); i <=Math.max(a,b) ; i++) {
            if (i%7!=0){continue;
            }System.out.print(" "+i);
        }
        System.out.println();
//7ye bölünenleri çıkar diğerlerini yazdır

        for (int i = Math.min(a,b); i <=Math.max(a,b) ; i++) {
            if (i%7==0)continue;//true ise devam etme forun başa dön
            System.out.print(" "+i);

        }

    }
}
