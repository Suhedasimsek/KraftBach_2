package Camp;

import java.util.Scanner;

public class toplamSayı {
    public static void main(String[] args) {
        //faktoriyel toplam
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen toplamlarını vermesini istediğiniz sayıyı girin");
        int a=sc.nextInt();
        int toplam=0;
        for (int i = 0; i <=a ; i++) {
            toplam+=i;
            
        } System.out.println("toplam = " + toplam);
    }
}
