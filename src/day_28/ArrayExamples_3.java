package day_28;

import java.util.Arrays;

public class ArrayExamples_3 {/////asalsayı olmadı

    // Dün akşam eve giderken onları görmüştüm ü harfinin önünde ve arkasında olan harflerden bir metod yazıız.
    public static String üsüzKelime(String str) {
        String result = "";
        if (str.substring(0, 1).equals("ü")) {
            return result += str.substring(1, 2);
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("ü")) {
                result += str.substring(i - 1, i);
                result += str.substring(i + 1, i + 2);
            }
            if (str.substring(str.length() - 1).equals("ü")) {
                return result + str.substring(str.length() - 2, str.length() - 1);
            }
        }
        return result;
    }


    //Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.


    public static void main(String[] args) {
        String str1 = "Dün akşam eve giderken onları görmüştüm";
        System.out.println(üsüzKelime(str1));
        int[] sayılar2 = {1, 2, 5, 3, 7, 9, 6, 34, 76, 63};
        System.out.println((asalSayıDöndür(sayılar2)));

    }

    public static String asalSayıDöndür(int[] array) {
        String result = "";

        FirstLoop:for (int sayı : array) {
            if (sayı == 2) {
                result += sayı + " ";
            }
            else if (sayı == 0 || sayı == 1) {continue FirstLoop;
            }
            else {
                for (int i = 2; i < sayı; i++) {
                    if (sayı%i==0) {
                        continue FirstLoop;
                    }

                }
                 result += sayı + " ";
            }

        }
        return result;

    }

}


//
//        //Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)
//    public static int[] küçükBüyükSırala (int[] array){
//
//    }
//
//
//
//
//
//
//


















