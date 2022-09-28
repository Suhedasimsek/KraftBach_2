package day_46;

import java.util.Scanner;

public class ExeptionTutorial {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("program başladı");


            System.out.print(" sayı : ");
            int x = scan.nextInt();
            System.out.print("bölüm : ");
            int y = scan.nextInt();

            System.out.println("sonuç: " + (x / y));

            System.out.println("program bitti");
        }
    }

