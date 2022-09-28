package day_35_İnheritance;

public class Parent_Child_Test {
    public static void main(String[] args) {
ChildClass childClass=new ChildClass();
childClass.print_Message_c();
childClass.print_message_p();// extend olduğu için parentclassın metodlarına da erişir

ParentsClass parentsClass=new ParentsClass();
//parentsClass.print_message_c();// parentclass childclassın metodlarına erişemez.
    }
}
