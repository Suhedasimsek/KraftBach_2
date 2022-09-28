package day_35_İnheritance;

public class Garage_Minibus {
    public static void main(String[] args) {


        MiniBus miniBus = new MiniBus();
        miniBus.type="Minibus";
        miniBus.color="Mavi";
        miniBus.seat=14;
        miniBus.SellPricewithTax(50000);

        miniBus.using();
        miniBus.toString();

    }
}
class GarageTruck {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.carryingCapasity=16;
        truck.color="kırmızı";
        truck.price=120000;
        truck.type="Truck";

truck.carrying();
truck.toString();

    }



}
