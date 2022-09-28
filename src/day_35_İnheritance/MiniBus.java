package day_35_İnheritance;

public class MiniBus extends Vehicle {
    int seat;// defaultdur
    public void using(){
        System.out.println(color+ ""+type+" "+seat+" yolcu taşır");

    }


    public String toString() {
        return "MiniBus{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
