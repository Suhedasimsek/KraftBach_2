package day_34_Static.staticVariable;

public class Counter {
    static int counter;// static olduğu içn herbir nesnede classa ait
    // bir değişkene 1 eklemiş olacak

    public Counter() {
        counter++;
        System.out.println(counter);
    }
}

class main{
public static void main(String[]args){
Counter counter1=new Counter();
Counter counter2=new Counter();
Counter counter3=new Counter();

        }
}