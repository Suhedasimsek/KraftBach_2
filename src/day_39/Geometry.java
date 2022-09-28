package day_39;

public abstract class Geometry {
    String nameofShape;

    public Geometry(String nameofShape) {
        this.nameofShape=nameofShape;
    }

    abstract double area();
    abstract String info();

    String getNameofShape(){
        return nameofShape;
    }

}
class Circle extends Geometry{
    double radius;

     public Circle (String nameofShape, double radius){
        super(nameofShape);
        this.radius=radius;
    }
    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "Name of shape= "+ nameofShape+ " area is= "+area();
    }
}
class Square extends Geometry{
    double lenght=5;

     public Square (String nameofShape, double lenght){
        super(nameofShape);
        this.lenght=lenght;
    }


    @Override
    double area() {
        return Math.pow(lenght,2);
    }

    @Override
    String info() {
        return "Name of shape= "+ nameofShape+ " area is= "+area();
    }
}