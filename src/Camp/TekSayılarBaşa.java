package Camp;

import java.util.ArrayList;
import java.util.Scanner;

public class TekSayılarBaşa {
    public static void main(String[] args) {


        int  yedek;
        char c;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        String sayı=sc.nextLine();//    //sayıyı charatla parçalayıp tektek gezebilmek için böyle yapıyor.String tanımladığım için bunu aldım

        ArrayList<Integer> list=new ArrayList<>();


        for (int i = 0; i <sayı.length(); i++) {
            list.add(Integer.parseInt(Character.toString(sayı.charAt(i))));
        }
        System.out.println(list);


        for (int j = 0; j < sayı.length(); j++) {
            if (list.get(j)%2!=0){
                yedek=list.get(j);
                list.remove(j);
                list.add(0,yedek);
            }System.out.println(list);
        }

    }
}
