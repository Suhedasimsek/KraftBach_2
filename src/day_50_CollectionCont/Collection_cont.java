package day_50_CollectionCont;

import java.util.Arrays;
import java.util.Vector;

public class Collection_cont {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>();
        vec.add("nn");
        System.out.println(vec.size());
        System.out.println(vec);
        vec.addAll(Arrays.asList("aa","bb","cc"));
        System.out.println(vec.size());
        System.out.println(vec.capacity());
        System.out.println(vec);
       // vec.clear();
        System.out.println(vec);

        Object clone=vec.clone();
        System.out.println(clone);

        System.out.println(vec.contains("nn"));
        System.out.println(vec.containsAll(Arrays.asList("aa", "bb")));

        String[] strings= new String[8];
        Arrays.toString(strings);
        vec.copyInto(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println(vec.capacity());
        vec.ensureCapacity(33);
        System.out.println(vec.capacity());
        vec.trimToSize();
        System.out.println(vec.capacity());

        vec.set(2,"xx");
        System.out.println(vec);
        vec.setElementAt("zz",1);
        System.out.println(vec);
    }
}
