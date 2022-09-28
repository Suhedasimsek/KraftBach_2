package day_33_Encapsulation;

public class Dog {
    public String name;
    private String breed;
    public boolean isBlack;
    private int age;
    static int foot=2;
    public Dog (){
        }
    public String getName (){
        return this.name;}

    public void setName(String name) {
        this.name = name;}

    public String getBreed (){
        return this.breed;}

    public void setBreed(String breed) {

        this.breed = breed;
    }
}
