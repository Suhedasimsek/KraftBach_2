package Camp;

import java.util.Scanner;

public class YediyeTamBölünenSayıyaArtan {
    public static void main(String[] args) {
        //Verilen sayhılar arasını artan sırala 7ye bölen çıkana kadar
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        for (int i = Math.min(a,b); i <=Math.max(a,b) ; i++) {
            if (i%7==0){break;
            }System.out.print(" "+i);
        }
        System.out.println();
////Azalan sıralama
        for (int i = Math.max(a,b); i >=Math.min(a,b) ; i--) {
            if (i%7==0){break;
            }
            System.out.print(" "+i);
        }

    }
}
