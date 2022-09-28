package day_40_interface;

public class Circle extends Square implements Geometric{
    public Circle(double a) {
        super(a);
    }
    @Override
    public double getArea() {
        return super.getArea()*Math.PI;
    }
    }




