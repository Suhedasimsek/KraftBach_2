package day_41_Polymorphism;

public interface IVehicle {
    int TekerSayisi=4;
    public abstract void start();
    public abstract void stop();
    public abstract int durmaMesafesi();

    default int TekerSayısı(){
        return TekerSayisi;
    }

}
