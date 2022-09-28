package day_20;

import java.util.Scanner;

public class String_Methods_Cont {
    public static void main(String[] args) {
        // System.out.println(ikiKelime("ayşe", "şüheda"));
        //System.out.println(county("javayı seviyor musun?"));
        //System.out.println(sesliHarf("javayı seviyor musun?"));
        // seversen("Çocuk severim");

        //son3Harf("Şüheda");
        //System.out.println(ortadaüç("Aslıhan"));
        //System.out.println(isimKısalt("Ayşegül", "Sever"));
//            İsimBasHarf("Talip", "kıraş");

        System.out.println(NickName("Şüheda", "Şimşek"));

    }

//    public static int ikiKelime(String str1, String str2) {
//        return str1.indexOf(str2.charAt(0));


//    "javayıSeviyor muyum?" ifadesindeki y harfinin sayısını veren
//    bir program yazın.
//
//    public static int county (String str){
//        int count=0;
//        for (int i = 0; i <str.length() ; i++) {
//            if ((str.charAt(i)== 'y') || (str.charAt(i)== 'Y')) {
//                count++;
//            }
//
//        }return count;

//    public static String sesliHarf(String str) {
//        String sonuc = "";
//        for (int i = 0; i < str.length(); i++) {
//            switch (str.charAt(i)) {
//                case 'a', 'e', 'i', 'ı', 'o', 'ö', 'u', 'ü':
//                    sonuc += str.charAt(i);
//                    break;
//                default:
//            }
//        }
//        return sonuc;
//    }

//    public static void seversen(String str) {
//
//
//        if (str.contains("sev")) {
//            System.out.println("What a lovely person");
//        } else {
//            System.out.println("ok");
//        }
//
//
//    }

//
//    public static void son3Harf(String str){
//        String holder="";
//        for (int i = 0; i < 3; i++) {
//            holder+=str.substring(str.length()-3);
//
//        }
//        System.out.println(holder);
//    }

//


//

//    İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
//    başharfinden arındırıpyazdıranbir method oluşturun.
//
//
//    public static void İsimBasHarf(String str1, String str2) {
//          String empty=" ";
//          char birincininİlkHarfi=str1.charAt(0);
//
//        for (int i = 0; i < str2.length(); i++) {
//            if (str2.charAt(i)!=birincininİlkHarfi){
//                empty+=str2.charAt(i);
//
//            }
//
//        }
//        System.out.println(empty);
//
//            }
//
//            4-İsminizinilk 3 harfi ve soy isminizin son 3 harfi ile nickname
//    oluşturanbir method yazın.
//
//


    public static String NickName(String str1, String str2) {
        String nickName = str1.substring(0, 3).concat(str2.substring(str2.length() - 3));
        return nickName;


    }

}











