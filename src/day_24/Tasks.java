package day_24;

import com.sun.tools.javac.Main;

import java.sql.Array;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {

        int[] iArry = {1, 2, 3, 4, 5, 6};
        int[] iAr = {9, 7, 33, 76, 55, 34, 25};

        int[] int1 = {11, 2, 3, 4, 5, 6};
        int[] int2 = {1, 5, 7, 9, 6, 8};

        //System.out.println(Length(iArry));
        // System.out.println(besVarMı(iAr));
        //System.out.println(eşitMi(int2, iArry));
        //System.out.println(Arrays.toString(yeniArray(iAr,iArry)));
        //System.out.println(toplam(int2));
        //System.out.println(Arrays.toString(concatArray(int1,int2)));
        //System.out.println(Arrays.toString(concatArray(int1,int2)));
        //System.out.println(büyükOlan(iAr));
        //System.out.println(Arrays.toString(firstLastChange(iAr)));
       // System.out.println(Arrays.toString(reverseArray(int2)));
        //System.out.println(tekTopla(int1));
        String str="Bugün güzel bir gündü";
        String str2="kayısı,armut,üzüm,çilek,nar";
        System.out.println(Arrays.toString(AyrıArrayler(str2)));

        //System.out.println(Arrays.toString(stringtoArray(str)));

    }
    //Bir method yazınve int[] kabul etsin. length i 5 den büyükse true döndürsün.


    public static boolean Length(int[] iArry) {
        return iArry.length > 5;
    }

    //Bir method yazınint array kabul etsin array in içinde 5 olup olmadığınıkontrol etsin.

    public static boolean besVarMı(int[] iAr) {

        for (int i = 0; i < iAr.length; i++) {
            if (iAr[i] == 5) {
                return true;
            }
        }
        return false;
    }

    //Bir method yazınve 2 array kabul etsin ilk elemanlarıeşitsetrue döndürsün.

    public static boolean eşitMi(int[] int1, int[] int2) {
        if (int1[0] == int2[0]) {
            return true;
        }
        return false;
    }

//2 array kabul eden bir method yazınve arraylerin llk elemanlarıile yeni bir array döndürsün.

    public static int[] yeniArray(int[] i1, int[] i2) {
        int[] i3 = new int[2];// ya da int [] i3={i1[0],i2[0]}
        i3[0] = i1[0];
        i3[1] = i2[0];
        return i3;
    }

//Int array in elemanlarınıntoplamınıveren bir method yazın

    public static int toplam(int[] i1) {
        int result = 0;
        for (int i = 0; i < i1.length; i++) {
            result += i1[i];

        }
        return result;
    }

//Verilen 2 arrayi birleştirip array döndüren bir method yazın.


    public static int[] concatArray(int[] i1, int[] i2) {
        int[] newArray = new int[(i1.length + i2.length)];
        for (int i = 0; i < newArray.length; i++) {
            if (i < i1.length) {
                newArray[i] = i1[i];
            } else {
                newArray[i] = i2[i - i1.length];
            }
        }
        return newArray;

    }

    //İnt arry in en büyük elemanınındöndüren bir method yazın
    public static int büyükOlan(int[] Arr1) {
        int max = 0;
        for (int i = 0; i < Arr1.length; i++) {
            if (max < Arr1[i]) {
                max = Arr1[i];
            }

        }
        return max;

    }
//Bir array oluşturunve ilk ve son element leri swap(yer değiştirme)yapın.

    public static int[] firstLastChange(int[] Arr1) {///Bu değişim swap yapmak demektir//
        int temp = Arr1[0];
        Arr1[0] = Arr1[Arr1.length - 1];
        Arr1[Arr1.length - 1] = temp;
        return Arr1;

    }
   // Bir method yazınve verilen arry in elemanlarınıtersden sıralayıpyeni bir array döndürsün.

    public static int[] reverseArray (int[] Arr1){
        int[] ints=new int[Arr1.length];
        for (int i = 0; i < Arr1.length; i++) {
            ints[i]=Arr1[(Arr1.length-1)-i];

        }return  ints;
    }

    //Bir methodla verilen array ınteksayıindexinde bulunan elemanlarıntoplamınıalın.

    public static int tekTopla (int[] Arr1) {
        int sum=0;
        for (int i = 0; i <Arr1.length ; i++) {

            if ((Arr1[i]%2)!=0){
           sum+=Arr1[i];
            }
        } return sum;

    }
    //«merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringtoArray (String str){
       return str.split(" ");
    }

//«kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//    varsa onun yerine armut atayın.


    public static String[] AyrıArrayler (String str){
      String[] split= str.split(", ");
        for (int i = 0; i <split.length ; i++) {
            if (split[i].length() < 5) {
                split[i] = "çilek";
            }
            
        }return split;

    }










    }


































