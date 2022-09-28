package day_40_interface;

public interface Geometric {
    double a=0;
   double getArea();

    default double getPrimeter(double... sides){
        double primeter=0;
        for (double side: sides) {
            primeter+=side;
        }
return primeter;
    }
}
