package day_27;

import day_26.Arrays_Example_1;

public class ArrayExample_2 {
    public static void main(String[] args) {

        int[] sayılar = {3, 4, 5, 2,56,78,3,4,5,8,7,33,22,44};
        String alinti = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek\n" +
                "    dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp\n" +
                "    sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "    üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu";

//        System.out.println(EnBüyük2(sayılar));
//        System.out.println(ardardaüç(sayılar));
        // Arrays_Example_1.arrayYazdır(yalnızSayılar(sayılar));
        //System.out.println(dublicate(sayılar));
        //System.out.println(oSay(alinti,"o"));
        // System.out.println(dublicateString(alinti));
       // Arrays_Example_1.arrayYazdır(enKüçükSayı(sayılar));
        Arrays_Example_1.arrayYazdır(değerAtamaKontrol(sayılar,4,5,1));
    }

//Array içersindeki en büyük 2. sayıyı bulunuz.

    public static int EnBüyük2(int[] arr) {
        int max = arr[0];
        int maxiki = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (maxiki < arr[i] && arr[i] != max) {
                maxiki = arr[i];
            }

        }
        return maxiki;

    }

    // Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.


    public static boolean ardardaüç(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return true;
            }

        }
        return false;

    }

//Array’in içerindeki eşi olmayan yalnız sayıları bulan ve bunları ekrana yazdıran metodu
//yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)


    public static String[] yalnızSayılar(int[] arr) {

        String yalnızSayılar = "";
        if (arr.length == 1) {
            yalnızSayılar += arr[0] + " ";
            return yalnızSayılar.split(" ");
        }
        if (arr[0] != arr[1]) {
            yalnızSayılar += arr[0] + " ";
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                yalnızSayılar += arr[i] + " ";
            }
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            yalnızSayılar += arr[arr.length - 1] + " ";
        }

        return yalnızSayılar.split(" ");

    }


    // Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız.

    public static boolean dublicate(int[] arr) {
        if (arr.length == 1) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//    Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu. Filin yemek
//    dolu karnı horlarken bir aşağı bir yukarı gidiyordu. Filin horlama sesini duyan fare yuvasından çıkıp
//    sesin olduğu tarafa gitti, filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
//    üzerine oturdu, salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o
//    harfi vardır. (Büyük ve küçük ihmal edilecek)
//


    public static int oSay(String str, String harf) {
        str = str.toLowerCase();
        String[] arr = str.split("");
        int count = 0;

        for (String harf1 : arr) {
            if (harf1.equals(harf)) {
                count++;
            }

        }
        return count;
    }

    //Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu
    //yazınız.

    public static boolean dublicateString(String str) {
        String[] strArray = str.toLowerCase().split(" ");

        if (strArray.length == 1) {
            return false;
        }
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                if (i != j && strArray[i] == strArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    //Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine bu sayıyı atayan diğer
    //indekslere 0 atayan metodu yazınız.

    public static int[] enKüçükSayı(int[] arry) {
        int enKüçükSayı = arry[0];
        for (int sayı : arry) {
            if (sayı < enKüçükSayı) {
                enKüçükSayı = sayı;
            }
        }
        int[] yeniArray = new int[arry.length];
        yeniArray[0] = enKüçükSayı;
        for (int i = 1; i < yeniArray.length; i++) {
            yeniArray[i] = 0;
        }return yeniArray;
    }

//Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.

    public static int[] değerAtamaKontrol (int[] arry,int ilkDeğer, int sonDeğer, int atamaDeğeri) {
        int[] yeniArray=new int[arry.length];
        yeniArray[0]=arry[0];
        for (int i = 0; i <yeniArray.length-1 ; i++) {
            if (arry[i]==ilkDeğer && arry[i+1]==sonDeğer){
                yeniArray[i+1]=atamaDeğeri;
            }
            else {
                yeniArray[i+1]=arry[i+1];
            }


        } return yeniArray;
    }


}



