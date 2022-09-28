package day_44_OOP_Review.Acces_Modifier;

public class Car1_Class {
    String model;
    public int year;
    private int door=4;
    protected double engine;

    @Override
    public String toString() {
        return "Car1_Class{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
}
