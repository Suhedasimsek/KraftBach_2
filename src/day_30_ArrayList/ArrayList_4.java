package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList<String> position=new ArrayList<>();
        position.add("QA");
        position.add("Developer");
        position.add("UxDesigner");
        position.add("Deveps Engineer");
        position.add("Scrum Master");

        ArrayList<String> tools=new ArrayList<>();
         tools.add("SELENIUM");
         tools.add("JAVA");
         tools.add("FIGMA");
         tools.add("AZURE");
         tools.add("JIRA");

         position.addAll(tools);
        System.out.println(position);

        tools.addAll(position);
        System.out.println(tools);

        tools.removeAll(position);
        System.out.println(tools);

        ArrayList<String> others=new ArrayList<>();
        others.add("product owner");
        System.out.println(tools.removeAll(others));// içinde birşey bulamayınca false döndürüyor


    }
}
