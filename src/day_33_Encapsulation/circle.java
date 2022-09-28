package day_33_Encapsulation;

public class circle {
    public double radius;
    private final double PI=3.14;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circleArea(){
        return this.PI*this.radius*this.radius;
    }

}
