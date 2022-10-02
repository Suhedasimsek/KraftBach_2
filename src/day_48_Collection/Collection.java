package day_48_Collection;

import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
veriAlyYazdır();
    }
    //Kullanıcıdan veri al ve ekrana yazdır

    public static void veriAlyYazdır(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç adet sayı girmek istiyorsunuz");
        int x= scan.nextInt();
        int[] array=new int[x];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("sayı: ");
            array[i]=scan.nextInt();

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
