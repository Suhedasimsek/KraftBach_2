package day_51;

import day_52.Set_Ex;

import java.util.*;

public class soru8 {
    public static void main(String[] args) {
        String str="bugün eve çok geç geldim, ama kendimi çok mutlu hissediyorum";
        str=str.replaceAll(" ","") ;
        str=str.replaceAll(",","") ;

        System.out.println(str);

        String[] strArray=str.split("");

        Set<String> set=new HashSet<>(Arrays.asList(strArray));
        System.out.println(set);
        Set<String> set2=new TreeSet<>(Arrays.asList(strArray));
        System.out.println(set2);
        List<String> list =new ArrayList<>(Arrays.asList(strArray));
        System.out.println(list);
      Collections.sort(list);
        System.out.println(list);
    }


    //"bugün eve çok geç geldim, ama kendimi çok mutlu hissediyorum." içerisinde hangi harfler geçmektedir.




}
