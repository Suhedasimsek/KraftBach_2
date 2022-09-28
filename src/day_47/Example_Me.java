package day_47;

import java.util.Arrays;
import java.util.Scanner;

public class Example_Me {


//integer değişken kabul eden bir metot yazın
//kullanıcıdan tek bir giriş sağlayın
//kullanıcı integer dışında bir değer girerse  "Lütfen tekrar deneyiniz" hata mesajı verin
//kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin

       /*
       boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bir sayı giriniz");
                int x = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Lütfen tekrar deneyiniz");
                continue;
            }
            System.out.println("Programdan çıkış yapılıyor");
            devam=false;
        }


        // 2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        //2 adet catch bloğu kullanın sonunda finally bloğunu kullanın


        boolean devam = true;
        while (devam) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bir sayı giriniz");
                int x = scan.nextInt();
                System.out.println("Kaça bölünsün?");
                int y=scan.nextInt();
                System.out.println("sonuc: "+(x/y));
            } catch (ArithmeticException a) {
                System.out.println("Aritmetic exeption hatası");
                continue;
            }  catch (Exception e) {
                System.out.println("Lütfen tekrar deneyiniz");
                continue;
            } finally {
                System.out.println("Finally blok işliyor");
            }
            System.out.println("Programdan çıkış yapılıyor");
            devam=false;
        }

        //personel idlerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde
        //id gönderin (arr[]={}) bu idlerin içerisinde 0 var ise IllegalArgumentException hatası verin
        //bunu bir checkArrayId metodunun içerinde yapın true veya false retun edebilirsiniz
        // yada 0 veya 1 döndürebilirsiniz

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
       // System.out.println(checkArrayId(arr));
        try{
            System.out.println(checkArrayId(arr));
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Uygun olmayan personel id tespit edildi");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bilinmeyen bir hata");
        }
        System.out.println("Programa devam ediliyor");
    }


        public static boolean checkArrayId (int [] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==0)
                {
                     throw new IllegalArgumentException ("Personel id 0 olamaz");
                }
            }
return true;
        }
*/

    //array içerinde en büyük sayının index numarasını getiren metodu yazınız
    //eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.

    public static int maxNumberIndex(int[] array) throws Exception {

        int[] arr=array.clone();
        int indexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];

        if(arr.length==1) return 0;

        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }


       /* try {
            if(arr[arr.length-2]==x){
                throw new Exception("en büyük sayıdan 2 adet vardır");
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }catch (Exception e){}  */

        for(int i=0; i<array.length; i++){
            if(array[i]==x){
                indexNumber=i;
            }

        }
        return indexNumber;
    }

    // Arrays.sort(arr);
    //int min=arr[0];
    //int max=arr[arr.length-1];


    public static int  maxNumber(int[] arr){

        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        } return max;

    }


}



