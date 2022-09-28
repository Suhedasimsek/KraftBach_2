package Review.Class_Object;

public class Custemer {
    public static void main(String[] args) throws InterruptedException {
        Vehicles vehicle_1=new Vehicles();

        vehicle_1.type= "otobüs";
        vehicle_1.color="mavi";
        vehicle_1.tires=10;
        vehicle_1.price=2000;

vehicle_1.getİnfo();
vehicle_1.setWinter();
vehicle_1.forRent();
//vehicle_1.rentOption(3);


Thread.sleep(3000);


int i=1;
        while (i<11){
vehicle_1.rentOption(i);
       i++;

if (i>=5){
    vehicle_1.price=1800;
}
        }
    }
}
