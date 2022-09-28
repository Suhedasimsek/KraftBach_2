package day_41_Polymorphism;

public class Car implements IVehicle{
    @Override
    public void start() {
        System.out.println("Car stars");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public int durmaMesafesi() {
        return 20;
    }
}
