package day_46;

import java.util.Scanner;

public class Örnek {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int x = scan.nextInt();
        System.out.println(faktoriyel(x));


    }
        // Kullanıcıdanbir sayı alın ve bu sayının faktoriyelini alarak ekrana sonucu yazdırın

        public static int faktoriyel(int x){
            int sonuc=1;
            try {
                if (x<0) throw new Exception ("Sayı sıfırdan küçük olamaz");
                for (int i=1; i<=x; i++) {
                    sonuc *= i;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                return -1;
            }
           return sonuc;
        }
    }


