package day_41_Polymorphism;

import Review.Class_Object.Vehicles;

public class Main_Polimorphism {
    public static void main(String[] args) {
//        Animal karabas=new Dog();
//        karabas.eat();//overriding olmayanlar parent classından
//        karabas.voice();// overriding olanlar child classtan
//        karabas.sleep();
//        System.out.println(karabas.AyakSayisi);

        Car beyazCar=new SporCar();//Objeyi oluştur ama spor arabaya göre davransın
        beyazCar.start();
        beyazCar.stop();
        System.out.println(beyazCar.durmaMesafesi());

        IVehicle sarıCar=new SporCar();
        sarıCar.start();
        sarıCar.stop();
        System.out.println(sarıCar.durmaMesafesi());
        System.out.println(sarıCar.TekerSayısı());


    }

}
