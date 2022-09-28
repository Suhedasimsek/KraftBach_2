package day_17_class;

import java.util.Random;
import java.util.Scanner;

public class Banka {

    int hesapNo;
    String MüşteriAdı;
    double paraMiktarı;
    boolean mobilBankacılık;

    public void hesapAc (){
        Scanner scan=new Scanner(System.in);
        System.out.println("İsim: ");
        MüşteriAdı= scan.nextLine();
        Random random=new Random();

        hesapNo=random.nextInt(100000);
        System.out.println(MüşteriAdı+" "+ hesapNo+ " nolu hesabınız"+ "başarı ile oluşturulmuştur");
    }


    public void mobilBankacılıkOnay (){
        Scanner scan=new Scanner(System.in);
        System.out.println("Mobil bankacılık açmak için evet yazınız ");
        String onay= scan.nextLine();
        if (onay.equals ("evet") ||onay.equals("Evet") || onay.equals("EVET")) {
            mobilBankacılık =true;
            System.out.println("Mobil bankacılığı kullanabilirsiniz");
        }else {
            System.out.println("Mobil bankacılığı kullanamazsınız");
        }

    }


public void paraYatir (double para){
        paraMiktarı+=para;
}







}
