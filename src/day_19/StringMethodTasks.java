package day_19;

import java.util.Scanner;

public class StringMethodTasks {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();

        //System.out.println(CountOfChar(s));
        // System.out.println((fullNameLenght("Burcu", "Şimşek")));
        //System.out.println(fullNameUpper());
        //fullNameUpper();
        //System.out.println(message());
       // charMessage();
        //System.out.println(trim("  Ali ve Ayşe"));
        System.out.println(dateStamp("18/12/2022 21:22:23"));
    }

//    public static int CountOfChar(String str) {
//        return str.length();
//    }
//
//
//    public static int fullNameLenght(String name, String surname) {
////        Scanner sc = new Scanner(System.in);
////        String name = sc.nextLine();
////        String surname = sc.nextLine();
//
//        // return name.length() +surname.length();
//        return (name.concat(surname)).length();

    //}

//    public static String fullNameUpper() {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String surname = sc.nextLine();
//
//        return (name.concat(surname)).toUpperCase();
   // }
///ya da şöyle yapabilirim


//     public static void fullNameUpper (){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         String surname = sc.nextLine();
//         System.out.println((name.concat(surname)).toUpperCase());
//     }
//
//    public static char message () {
//        Scanner sc = new Scanner(System.in);
//        String message = sc.nextLine();
//        return message.charAt(message.length()-1);
//    }
//
//
//    public static void charMessage () {
//        Scanner sc = new Scanner(System.in);
//        String message = sc.nextLine();
//       for (int i=0; i<message.length(); i++) {
//           System.out.println(message.charAt(i));}
//    }

//public static String trim (String str){
//
//        return str.trim();
//}
////18/12/2022 21:22:23

//public static String dateStamp (String str){
//        String replace= str.replace("/","");
//        String replace1=replace.replace(" ","");
//        return replace1.replace(":","");

        //ya da

    public static String dateStamp (String str){
        String replace= str.replace("/","").replace(" ","").replace(":","");
         return replace.replace(" ","");
}















}






