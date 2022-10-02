package day_47;

import java.util.Arrays;

public class Example_withTeach {

    public static void main(String[] args) throws Exception {

        //integer değişken kabul eden bir metot yazın
        //kullanıcıdan tek bir giriş sağlayın
        //kullanıcı integer dışında bir değer girerse  "Lütfen tekrar deneyiniz" hata mesajı verin
        //kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin
        /*boolean devam=true;
        while(devam){

            try {
                Scanner scan=new Scanner(System.in);
                System.out.print("Sayı: ");
                int x=scan.nextInt();
            }catch (Exception e){
                System.out.println("Lütfen tekrar deneyiniz");
                continue;
            }
            System.out.println("programdan çıkış yapılıyor");
            devam=false;


        }

        // 2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        //2 adet catch bloğu kullanın sonunda finally bloğunu kullanın



boolean devam=true;


        while (devam){

            Scanner scan=new Scanner(System.in);

            try {
                System.out.print("Sayi : "); int x=scan.nextInt();
                System.out.print("Bölüm : "); int y=scan.nextInt();
                System.out.println("sonuc"+(x/y));
            }catch (ArithmeticException a){
                System.out.println("aritmetik bir hata mevcut tekrar deneyiniz");
                continue;
            }catch (Exception e){
                System.out.println("Hata alındı, tekrar deneyiniz");
                continue;
            }finally {
                System.out.println("(finally block uyarıyor) Daha dikkatli olun ");
            }

            devam=false;

        }



        //personel islerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde
        //id gönderin (arr[]={}) bu idlerin içerisinde 0 var ise IllegalArgumentException hatası verin
        //bunu bir checkArrayId metodunun içerinde yapın true veya false retun edebilirsiniz
        // yada 0 veya 1 döndürebilirsiniz

        int arr[]={111,125,0,36};
        try {
            System.out.println(checkArrayId(arr));
        }catch (IllegalArgumentException e){
           e.printStackTrace();
            System.out.println("Uygun olmayan Personel Id tespit edildi");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Bilinmeyen bir hata tespit edildi");
        }
        System.out.println("programa devam ediliyor");

      */


//        public static boolean checkArrayId ( int[] arr){
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == 0) {
//                    throw new IllegalArgumentException("Perdonel ID sıfır olamaz");
//                }
//
//            }
//            return true;
//
//        }
    }
}

