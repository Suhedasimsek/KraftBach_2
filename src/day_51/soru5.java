package day_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru5 {
    public static void main(String[] args) {
        String str="bir berber bir berbere gel beraber bir berber dükkanı açalım demiş";
        String [] strArray=str.split("ber");
        List<String> strlist= Arrays.asList(strArray);

        System.out.println(strlist );
    }
    //bir berber bir berbere gel beraber bir berber dükkanı açalım demiş

}
