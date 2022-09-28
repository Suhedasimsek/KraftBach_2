package day_44_OOP_Review.Acces_Modifier;

import day_44_OOP_Review.Acces_Modifier.Car1_Class;

public class CarTest1 {
    public static void main(String[] args) {
        Car1_Class car1=new Car1_Class();
        car1.model="Mazda";
        car1.year=2020;
        car1.engine=1.6;
        System.out.println(car1.toString());


        System.out.println(car1.engine);
        System.out.println(car1.model);
        System.out.println(car1.year);
    }
}
