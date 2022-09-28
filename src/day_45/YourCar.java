package day_45;

public class YourCar extends MyCar{
    public static boolean haveSunroof(){
        return true;
    }

    public void getMycarSunroofStatus(){
        System.out.println("Your car have sunroof: "+haveSunroof());
    }
}
