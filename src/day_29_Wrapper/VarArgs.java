package day_29_Wrapper;

public class VarArgs {
    public static void main(String[] args) {

sum(1,2);
sum(2,5,8,66,45,87,34);
sum(4,6,8,7,4,33,2,6);

    concat("ja","va"," ","insanları");
    concat("java"," ", "python"," ","insanları");
    concat1("ja","va");

    }


    public static void sum (int... sayılar){// variable arguments
       int sum=0;
        for (int i:sayılar) {
             sum+=i;
        }
        //System.out.println("Girilen " +sayılar.length+" sayının toplamı "+sum);
        }

        public static void concat(String...strs){
        String empty="";
            for (String s:strs) {
                empty+=s;
            }
            System.out.println(empty);
        }

    public static void concat1(String...strs){
        String empty="";
        for (int i = 0; i <strs.length ; i++) {
            empty+=strs[i].charAt(0);
        }
        System.out.println(empty);

        }







    }












