package day_41_Polymorphism;

public class Dog extends Animal {
    int disSayısı;

    public void voice() {
        System.out.println("hav hav");
    }
    @Override
    public void sleep() {
        super.sleep();
    }
    public void speed() {
         System.out.println("Dog very fast");
    }
}

