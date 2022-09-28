package day_25;

import java.util.Arrays;

public class Array_cont {
    public static void main(String[] args) {
        String str = "elma, armut, üzüm, çilek, nar";
        String str2 = "merhaba java insanları bugün nasılsınız";
        int[] sayılar = {2, 5, 7, 9, 34, 54};
//        System.out.println(Arrays.toString(Swap(str)));
//        System.out.println(Arrays.toString(StringtoArray(str2)));
//        System.out.println(Arrays.toString(sıralıYerleşim(12)));
//        System.out.println(Aritmetik(sayılar));
//        System.out.println(Arrays.toString(FillwithSmall(sayılar)));
        System.out.println(Arrays.toString(FillwithSmallexeptbig(sayılar)));
    }
    //«elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.


    public static String[] Swap(String str) {
        String[] split = str.split(", ");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;
        return split;
    }

    //«merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
    //harflerinden array döndüren method yazın.
    public static String[] StringtoArray(String str) {
        String[] arry = str.split(" ");
        return arry[1].split("");

    }

    //Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
    //biçimde bir array içine yerleştirsin. n = 5  Exm: [0,1,2,3,4]

    public static int[] sıralıYerleşim(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;

        }
        return array;

    }

    //Karmaşık Bir sayı dizisinin en büyük ve en küçük değerli elementlerinin aritmetik ortalamasını
    //veren bir method yazın.


    public static int Aritmetik(int[] arr) {
        Arrays.sort(arr);
        return (arr[0] + arr[arr.length - 1]) / 2;


    }
    //Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
    //method yazın.

    public static int[] FillwithSmall(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr, arr[0]);
        return arr;
    }

    //Bir sayı dizisinin en küçük harfi ne ise sayı dizisini (en büyük değer hariç)
    //onunla dolduran bir method yazın.

    public static int[] FillwithSmallexeptbig(int[] arr) {
        Arrays.sort(arr);
        Arrays.fill(arr,0,arr.length-1,arr[0]);
        return arr;


    }
}
