package Camp;

import java.util.Scanner;

public class BüyükSayı {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int a=sc.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int b=sc.nextInt();

        if(a>b){
                    System.out.println("İlk sayı büyüktür");
                } else if (a<b) {
                    System.out.println("İkinci sayı büyüktür");

                }else System.out.println("Sayılar eşittir");
    }
}
