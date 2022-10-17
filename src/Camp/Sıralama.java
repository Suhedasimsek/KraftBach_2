package Camp;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Sıralama {
    public static void main(String[] args) {
        //Input string( it is a single string, you can take input as param , from file or any possible way):-
        //samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',
        // 20916,
        // samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4,
        // WA52M7750AW, WA52M7750AW/A4',91995,
        // samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,
        // samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer
        // Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000

        NavigableMap<String, Integer> samsungFiyat = new TreeMap<>();
        samsungFiyat.put("samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2," +
                " WA48J7700AW/AA", 20916);
        samsungFiyat.put("samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4," +
                " WA52M7750AW, WA52M7750AW/A4'", 91995);
        samsungFiyat.put("samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M'", 22970);
        samsungFiyat.put("samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK'", 29981);
        samsungFiyat.put("samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150'", 52000);
        samsungFiyat.put("samsung,'Samsung DC97-16991A Assembly Filter'", 13000);

        for (int i = 0; i < samsungFiyat.size(); i++) {

        }

    }
}


