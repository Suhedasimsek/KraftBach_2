package Camp;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktoriyelini almak istediğiniz sayıyı giriniz");
        int x=scanner.nextInt();
        int faktoriyel=1;
        for (int i = 1; i <=x ; i++) {
            faktoriyel*=i;
            System.out.println("faktoriyel = " + faktoriyel);//içeri yazarsam hepsini gösterir
        } System.out.println("faktoriyel = " + faktoriyel);//dışarı yazarsam sadece sonucu
    }


}
