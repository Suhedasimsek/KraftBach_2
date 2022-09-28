package day_10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // System.out.println("Bir ay giriniz?");

        /*int aySayi = sc.nextInt();

        switch (aySayi) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("girdiğiniz sayı bir ay ile eşleşmiyor.");

        }


        System.out.println("Haftanın kaçıncı günündeyiz?");

        int günSayi = sc.nextInt();

        switch (günSayi) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("girdiğiniz sayı bir ay ile eşleşmiyor.");





        int  beden = 50;

        switch (beden) {
            case 38, 40, 42:
                System.out.println(beden +" bir Small bedendir");
                break;
            case 44, 46, 48:
                System.out.println(beden +" bir Medium bedendir");
                break;
            case 50, 52, 54:
                System.out.println(beden + "bir Large bedendir");
                break;
            default:
                System.out.println("Bu numarada tanımlı bir beden bulunmamaktadır");

        System.out.println("Hesap makinesi hazır");

        int numara1 = sc.nextInt();
        sc.nextLine();
        String aritmetik1 = sc.nextLine();
        int numara2 = sc.nextInt();
        int sonuc=0;

        switch(aritmetik1)

        {

            case "+":
                System.out.println("sonuc " +(numara1 + numara2));

                break;
            case "-":
                System.out.println("sonuc " +(numara1 - numara2));
                break;

            case "*":
                System.out.println("sonuc " +(numara1 * numara2));
                break;

            case "/":
                System.out.println("sonuc " +(numara1 / numara2));
                break;

            default:
                System.out.println("Girdiğiniz matematiksel işaret yanlıştır");


        }


        System.out.println("Pozitif bir sayı giriniz");
        int sayi = 150;
        int tahmin = sc.nextInt();


        if (tahmin < sayi) {
            if (tahmin < sayi / 2) {
                System.out.println("Yakın değilsin Biraz daha büyük bir sayı giriniz");

            } else if (tahmin > sayi / 2) {
                System.out.println("Yaklaştınız biraz daha büyük bir sayı giriniz");
            } else {
                System.out.println("Pek yakın sayılmazsın");
            }
        }
            else if (tahmin > sayi) {
                if (tahmin < sayi + sayi / 2) {
                    System.out.println("Tahmininiz yakın daha küçük bir sayı söyleyin");
            } else if (tahmin > sayi + sayi / 2) {
                System.out.println("Yakın değilsin daha küçük bir sayı söyleyin");
            } else {
                System.out.println("Pek yakın sayılmazsın");
            }

        } else {
            System.out.println("tEBRİKLER Başardınız");
        }

//        3 katlıbir motel in
//        1. katındaResepsion, Güvenlikve Oda hizmetler var.
//        2 katındaYemekhane, Dinlenme salonu ve Room1,Room2
//        3.katındaise Room3,Room4,Room5,Room6 vardır.
//                Bir switch yapısıile otel katlarınıve oda isimlerini girerek tanıtımalacagınızbir program(nested
//        switch) yazın. Tanıtımbilgileri içinaşağıdakilerikullanabilirsiniz.
//        message 1 : lütfenmotelimizi tanımakiçin1-2-3 bir kat numarasıgirin ve oda adıseçin.
//        message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
//        2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
//        3.kat : Room3-Room4-Room5-Room6
//        Resepsion : tümişlemleriniziçinbekleriz
//        Güvenlik: profosyonel bir hizmettir
//        Oda hizmetleri : temizlik ve taşımahizmetleri için101 dahili hattan ulaşabilirsiniz
//        Yemekhane : Kahvaltı08-11
//        Öğleyemeği12-15
//        Akşamyemeği18-21
//        Dinlenme salonu : 24 saat çayservisi ile hizmetinizdedir
//        Room1,Room2 : ekonomik oda
//        Room3,Room4 : standart oda
//        Room5,Room6 : özeloda


        int kat= sc.nextInt();
        String secim=sc.nextLine();

        System.out.print("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adıseçin.");
        System.out.print("1.kat : Resepsion-Güvenlik-Oda hizmetleri" +
                "2 katındaYemekhane, Dinlenme salonu ve Room1,Room2" +
                "3.katındaise Room3,Room4,Room5,Room6 vardır.");

   switch (kat) {
       case 1:
           switch (secim) {
               case "Resepsiyon":
                   System.out.println("tümi şlemleriniz içinbekleriz");
               break;
               case "Güvenlik":
                   System.out.println("profosyonel bir hizmettir");
                   break;
               case "Oda hizmetleri":
                   System.out.println("Temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz");
                   break;
               default:
                   System.out.println("Byle bir oda yoktur");
           }
           break;
       case 2:
           switch (secim) {
               case "Yemekhane":
                   System.out.println("Kahvaltı08-11\n Öğleyemeği12-15\nAkşamyemeği18-21");
                   break;
               case "Dinlenme salonu":
                   System.out.println("24 saat çayservisi ile hizmetinizdedir");
                   break;
               case "Room1", "Room2":
                   System.out.println("ekonomik oda");
                   break;
               default:
                   System.out.println("Byle bir oda yoktur");
           }
           break;
       case 3:
           switch (secim) {
               case "Room3","Room4":
                   System.out.println("standart oda");
               break;
               case "Room5","Room6":
                   System.out.println("özeloda");
                   break;
               default:
                   System.out.println("Byle bir oda yoktur");
           }
           break;
       default:
           System.out.println("Otelimiz 3 katlıdır");

   }*/





    }


    }








