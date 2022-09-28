package day_15;

public class methodReturnType {
    public static void main(String[] args) {


        LastDijitCheck(66, 45);
//
//
//   System.out.println(LastDijitCheck(22,33));
//
////        boolean bl= LastDijitCheck(66, 45);
////        System.out.println(bl);
//
//        System.out.println(LastDijitCheck(34,65));


        //System.out.println(asal(88));

        //System.out.println(convert(-67));


        //
        // System.out.println(dersNotu(55, 77, 88));

    }

    public static boolean LastDijitCheck(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public static boolean asal(int a) {
        if (a == 0 || a == 1) {
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static int convert(int a) {
        //return a>0? a:-a;

        return Math.abs(a);
    }


//    Bir method yazın dönüş tipi char olsun. 3 ders notu kabul
//    etsin ve ortalamayı harf cinsinden döndürsün .

    public static char dersNotu(double note1, double note2, double note3) {
        double ortalama = (note1 + note2 + note3) / 3;
        if (ortalama >= 75 && ortalama <= 100) {
            return 'A';
        } else if (ortalama >= 50 && ortalama <= 75) {
            return 'B';
        } else if (ortalama >= 0 && ortalama <= 50) {
            return 'C';
        }
        return 'x';


    }









}











