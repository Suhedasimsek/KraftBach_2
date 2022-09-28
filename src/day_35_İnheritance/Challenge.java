package day_35_İnheritance;

public class Challenge extends GameActivity {
    private int shootOption;//HEDEF
    private int pointofShoot;
    private int shootSuccess;

    public Challenge(int shootOption, int shootSuccess) {
        int point;
        this.shootOption = shootOption;
        this.shootSuccess = shootSuccess;


        pointofShoot = 1000 / shootOption;
        point = pointofShoot * shootSuccess;

        setScore(point); //score parent classda private olduğu için metod içinde çağırabiliyorum.
        // prşvate olmasaydı direk score=point diye çağırabilirdim.

        //private elemanlar kalıtsal olamaz.inharance kullanılamaz.
    }
}
