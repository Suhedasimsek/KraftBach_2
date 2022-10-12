package Camp;

public class StringTerstenYazdırma {
    public static void main(String[] args) {
        //Boşlukları alarak sadece son kelimeyi tersten yazdırsın
        String str= "Welcom to bootcamp";
        String reverse="";
        for (int i =str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)==' '){
                break;
            }
            if (str.charAt(i)!=' '){
                reverse+=str.charAt(i);
            }
        }
        System.out.println(reverse);

        //Bütün harfleri boşluksuz tersten yazdırsın
        for (int i =str.length()-1; i >=0 ; i--) {
            if (str.charAt(i)!=' '){
                reverse+=str.charAt(i);
            }
        }
        System.out.println(reverse);




    }
}
