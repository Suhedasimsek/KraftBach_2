package Review.Class_Object;

public class Vehicles {

   // attributes or fields
    String type;
    String color;
    int tires;
    int price;

//methods

    public void getİnfo(){
        System.out.println("Vehicle { type: "+type+ " color: "+color+ " tires: "+tires+ "price: "+price +"}" );

    }
    public void setWinter(){
        System.out.println(color+ " "+type+ " için "+ tires+ " adet kışlık lastik gerek");
    }
    public void forRent(){
        System.out.println(color+ " "+type+ " için bir günlük kiralama bedeli "+price+ " tldir");
    }
    public void rentOption(int dayCount){
        System.out.println(color+ " renkli "+type+ " için "+ dayCount +"  günlük kiralama bedeli "+(dayCount*price)+ " tldir");
    }
}
