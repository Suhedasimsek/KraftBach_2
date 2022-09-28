package day_26;

import java.util.Arrays;
import java.util.Random;

public class Arrays_Example_1 {
    public static void main(String[] args) {

        int[] sayılar = {1, 3, 5, 8, 65, 87, 45};
        int[] sayılar2 = {7, 3, 5, 9, 57, 97, 87};

//        System.out.println(Toplam(sayılar));
//        System.out.println(çiftToplam(sayılar));
//        System.out.println(üçToplam(sayılar));
//        System.out.println(maxminFarkı(sayılar));
//        System.out.println(maxminFarkı2(sayılar));
//        System.out.println(Arrays.toString(enKüçükSayıDoldur(sayılar)));
//        System.out.println(Arrays.toString(araSayıAta(5, 9)));
//        arrayYazdır(araSayıAta(5,9));
      // arrayYazdır(arrayBirleştir(sayılar,sayılar2));
      // arrayYazdır(YeniArray5080(15));
        System.out.println(YeniArray125kontrol(500));

    }

    //Array’in içerisindeki tüm sayıların toplamını veren metodu yazını
    public static int Toplam(int[] arry) {
        int result = 0;
        for (int i = 0; i < arry.length; i++) {
            result += arry[i];

        }
        return result;

    }
//Örnek 2: Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int çiftToplam(int[] arry) {
        int result = 0;
        for (int i = 0; i < arry.length; i++) {

            if (arry[i] % 2 == 0) {
                result += arry[i];
            }

        }
        return result;
    }

//Örnek 3: Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.


    public static int üçToplam(int[] arry) {
        int result = 0;
        for (int i = 0; i < arry.length; i++) {

            if (arry[i] == 3) {
                result += arry[i];
            }

        }
        return result;

    }
    //Örnek 4: Array’in içerisindeki en büyük ve en küçük sayı arasındaki farkı bulan metodu yazınız. (Arrays.sort
    //kullanılmayacak)

    public static int maxminFarkı(int[] arry) {
        int max = arry[0];
        int min = arry[0];

        for (int i = 0; i < arry.length; i++) {

            if (max < arry[i]) {
                max = arry[i];
            }

            if (min > arry[i]) {
                min = arry[i];
            }

        }
        return max - min;


    }

    public static int maxminFarkı2(int[] arry) {
        int[] arry2 = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            arry2 = arry;
        }
        Arrays.sort(arry2);
        return arry[arry.length - 1] - arry[0];
    }

    //Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.(Arrays.sort ve
    //Arrays.fill kullanılmayacak)

    public static int[] enKüçükSayıDoldur(int[] arry) {
        int[] arry2 = new int[arry.length];
        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (min > arry[i]) {
                min = arry[i];
        }
            arry2[i] = min;
        }
        return arry2;
    }

//Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.

    public static int[] araSayıAta(int a,int b) {
       int max=Math.max(a,b);

       if (max==a){
           int [] arry=new int[(a-b)+1];
           for (int i = 0; i <arry.length ; i++) {
               arry[i]=b+i;
                   
       }return arry;
    }else {
           int [] arry=new int[(b-a)+1];
           for (int i = 0; i <arry.length ; i++) {
               arry[i]=a+i;

           }return arry;
       }
    }

    public static void arrayYazdır (int[] arry) {
        for (int sayı : arry) {
            System.out.print(sayı+" ");
        }
    }
//2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte tek bir array
//oluşturan metodu yazınız.
    public static int[] arrayBirleştir (int[] arry1, int[] arry2) {
        int[] result=new int[arry1.length+arry2.length];
        for (int i = 0, j=0; i < result.length; i++) {
            if (i<arry1.length){
                result[i]= arry1[i];
            }
         if(i>arry1.length-1) {
             result[i]= arry2[j];
             j++;
         }
         }  return result;
    }

    //Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 50-80
    //arasında rasgele sayılar atayın.
      public static int[] YeniArray5080 (int boyut ){
        int[] yeniArray=new int[boyut];
          Random random=new Random();
          for (int i = 0; i < boyut; i++) {
              yeniArray[i]=random.nextInt(30)+50;

          }return yeniArray;

      }

//    Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak 120-140
//    arasında rasgele sayılar atayın.  Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static int YeniArray125kontrol (int boyut ){

        int[] yeniArray=new int[boyut];
        Random random=new Random();
        int count=0;
        for (int i = 0; i < boyut; i++) {
            yeniArray[i] = random.nextInt(20) + 120;
            if (yeniArray[i] == 125) {
                count++;

            }
        }return count;

    }







}
