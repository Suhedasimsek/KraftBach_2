package day_41_Polymorphism;

public class SporCar extends Car{
    boolean isCabRio;

    @Override
    public void start() {
        System.out.println("Spor araba başladı");;
    }

    @Override
    public void stop() {
        System.out.println("Spor araba durdu");
    }

   public void hızlanma (){
       System.out.println("Spor araba hızlanıyor");
   }
}
