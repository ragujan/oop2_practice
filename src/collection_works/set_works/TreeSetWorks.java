package collection_works.set_works;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWorks {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Set set = Collections.synchronizedSet(ts);
        ts.add("333");
        ts.add("33-");
        ts.add("333");
        ts.add("33222");
        ts.add("333");
        ts.add("333");
        ts.add("33f");
        ts.add(null);
        System.out.println(ts);
        System.out.println(ts.higher("3333"));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println(ts);

    }
}
