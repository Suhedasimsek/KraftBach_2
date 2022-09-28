package day_25;

import java.util.Arrays;

public class MultiDimensinal {
    public static void main(String[] args) {
String str="Merhaba java insanları bugün nasılsınız?";


        System.out.println(Arrays.deepToString(splitArray(str)));


    }


//«merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
//insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.

    public static String [][] splitArray (String str){
        String[] arr=str.split(" ");
        String[] strings= Arrays.copyOfRange(arr,0,3);
        String[] strings1= Arrays.copyOfRange(arr,3,5);
        String [][] strings2= {strings,strings1};
return strings2;
    }
}
