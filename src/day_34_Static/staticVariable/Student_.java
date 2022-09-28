package day_34_Static.staticVariable;

public class Student_ {
    String name;
    int number;
    static String schoolName="KRAFT";

    public Student_(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public String getinfo() {
        return "student_{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
