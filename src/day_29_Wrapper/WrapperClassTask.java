package day_29_Wrapper;

public class WrapperClassTask {
    public static void main(String[] args) {
        String str = "^+!j4546*/-a_|v-:!a ???()&+";
        String empty="";
        for (int i = 0; i <str.length() ; i++) {
           if (Character.isAlphabetic(str.charAt(i))){
               empty+= str.charAt(i);
           }

        }System.out.println("Harf olanlar " + empty);


        String str2 ="\"|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>"+
                ">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*\"+\n"+
                "*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||\"";

        String empty2="";
        for (int i = 0; i <str2.length() ; i++) {
            if (Character.isLetter(str.charAt(i)) || str2.charAt(i)==' '){
                empty2+= str2.charAt(i);
            }

        }System.out.println("Empty2 " + empty2);








    }
}
