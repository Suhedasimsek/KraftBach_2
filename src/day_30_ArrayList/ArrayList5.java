package day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {

        ArrayList<String> weekDays=new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList<String> allDays=new ArrayList<>(weekDays);
        System.out.println(allDays.get(0));
        allDays.add("Saturday");
        allDays.add("Sunday");
        System.out.println(allDays);

        ArrayList<String> alterDays=allDays;
        alterDays.set(0,"pazartesi");
        System.out.println(allDays); //alldays artık alterdaysın aynı referansına atandı

        System.out.println(allDays.contains("Tuesday"));
        System.out.println(allDays.indexOf("Tuesday"));

        System.out.println(allDays.get(0) == "Tuesday");
        System.out.println(allDays.get(1).equals("Tuesday"));
        System.out.println(weekDays);
        System.out.println(allDays);

        System.out.println(allDays.contains(weekDays));
        System.out.println(weekDays.contains(allDays));

    }
}
