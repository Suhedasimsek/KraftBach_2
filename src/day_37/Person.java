package day_37;

import java.util.Random;

public class Person {
    String name;
    String surname;
    int id;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void İdOluştur (){
        Random random=new Random();
        this.id= random.nextInt(100)+1;





    }
}
