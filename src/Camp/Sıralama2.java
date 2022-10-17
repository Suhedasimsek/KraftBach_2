package Camp;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Sıralama2 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> samsungFiyat=new TreeMap<>();
        samsungFiyat.put(20916,"samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2," +
                " WA48J7700AW/AA");
        samsungFiyat.put(91995, "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4," +
                " WA52M7750AW, WA52M7750AW/A4'");
        samsungFiyat.put(22970, "samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M'");
        samsungFiyat.put(29981, "samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK'");
        samsungFiyat.put(52000, "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150'");
        samsungFiyat.put(13000, "samsung,'Samsung DC97-16991A Assembly Filter'");

        System.out.println(samsungFiyat);
    }
}
