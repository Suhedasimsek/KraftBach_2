package day_34_Static.staticMethod;

import java.util.Random;

public class Geometric {
    static int primeter;
    static int counterside;

    public static void setPrimeter (int... sides) {
        for (int i : sides) {
            primeter += i;
            counterside++;

            System.out.println("Geometrik şeklin çevresi " + primeter);
            System.out.println("Geometrik şeklin kenar sayısı " + counterside);

        }
    }
    class Main_2 {
        public static void main(String[] args) {
            Geometric.setPrimeter(generateSide(),generateSide(),generateSide());
        }


        public static int generateSide (){
            Random rd=new Random();
            return rd.nextInt(10);
        }
    }



}
