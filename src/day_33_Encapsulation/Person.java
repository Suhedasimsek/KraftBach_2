package day_33_Encapsulation;

public class Person {
    public String name;
    public int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName (String name){
        System.out.println(name);
    }



}

