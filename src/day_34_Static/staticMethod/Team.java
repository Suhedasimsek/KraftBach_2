package day_34_Static.staticMethod;

public class Team {
    String name;
    static int team;

    public Team(String name) {
        this.name = name;
    }

    public static void teamChangeto(int i) {
         team = i;
    }


    public void getinfo() {
        System.out.println("Team{" + "team= " + team+ "name='" + name + '\'' +
                        '}');
    }

}
    class Main {
        public static void main(String[] args) {
            Team member1=new Team("Şüheda");
            Team member2=new Team("Asım");
            Team member3=new Team("İnci");
            Team member4=new Team("Arzu");

        }

    }


