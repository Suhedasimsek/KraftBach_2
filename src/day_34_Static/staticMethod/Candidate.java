package day_34_Static.staticMethod;

public class Candidate {

    String name;
    int schoolID;
    static String branch;
    static int counter;

    public Candidate(String name) {
        this.name = name;
        schoolID = setNumber();
    }
    public static int setNumber (){
        counter++;
        return counter;
    }
    public static void setBranch (String str){
        branch=str;
    }
    public void getinfo (){
        System.out.println(name);
        System.out.println(schoolID);
        System.out.println(branch);
    }
}
class Main3 {
    public static void main(String[] args) {
        Candidate c1=new Candidate("Zeynep");
        Candidate c2=new Candidate("Fatıma");
        Candidate c3=new Candidate("Rukiye");
        Candidate c4=new Candidate("Ayşe");
        Candidate.setBranch("Java");
  c1.getinfo();
  c2.getinfo();
  c3.getinfo();

    }


}



