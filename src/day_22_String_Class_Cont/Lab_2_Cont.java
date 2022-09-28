package day_22_String_Class_Cont;

public class Lab_2_Cont {
    public static void main(String[] args) {
        //System.out.println(uzunYaz("ali", "alparslan"));
        //System.out.println(BesKarakter("alp"));
        //System.out.println(twoLetter("kafka"));
        //System.out.println(surname("Seyda Burcu Şüheda Şimşek"));
        //System.out.println(YinelenenKarakterAt("arabalarda"));
        //System.out.println(YinelenenKarakterYaz("asmasadam"));
        System.out.println(RakamBul("çlkjhgbn567890"));
    }

    //    Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
//    defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
//    Mehmet

    public static String uzunYaz(String str1, String str2) {
        String result = " ";
        if (str1.length() < str2.length()) {
            for (int i = 0; i < 2; i++) {
                result += str1;}
            for (int j = 0; j < 30; j++) {
                result += str2;}
            for (int k = 0; k < 2; k++) {
                result += str1;}
            return result;
        }else {  for (int i = 0; i < 2; i++) {
            result+=str2;}
            for (int j = 0; j <30 ; j++) {
                result+=str1;}
            for (int k = 0; k < 2; k++) {
                    result+=str2;}
                }return result;
            }
//Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
//altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.


            public static String BesKarakter(String str){

        if(str.length()>=5) {
            return str.substring(0,5);
            } else {
            String result="";
        for (int i = 0; i < (5-(str.length())); i++) {
            result+=".";}
         return str+result;

        }
            }

//    Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
//    almıyorsa false yazdırın.

                public static boolean twoLetter (String str){
            String str1=str.toLowerCase();
            return str1.endsWith(str1.substring(0,2));
            //str1.substring(0,2).equals(str1.substring(str1.length())-2))
                }



//    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır."  Yazan metodu yazınız.


                public static String surname (String str){
        String str1=str.trim();
        return str1.substring(str1.lastIndexOf(" ")+1);}


//                    Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
//                    çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
//                    Merhaba Merhab
//                    Ananas Anas



    public static String YinelenenKarakterAt (String str){
        String result="";
        while (!str.isEmpty()){
            result+=str.charAt(0);
            str= str.replace(str.substring(0,1), "");
        }return  result;

    }


//    Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//    olarak return eden methot yazınız.


    public static String YinelenenKarakterYaz (String str){
        String result="";
        String str1=str.replace(" ","");
        while (!str1.isEmpty()){
            if(str1.substring(1).contains(str1.substring(0,1))){
                result+= str1.substring(0,1);
            }
            str1=str1.replace(str1.substring(0,1), "");
        }return  result;

    }
//Kelimenin içindeki rakamları bulan programı yazınız
    public static String RakamBul (String str){
        String result=" ";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>47 && str.charAt(i)<58){
                result+= str.charAt(i);
            }

        }return result;
    }















    }



