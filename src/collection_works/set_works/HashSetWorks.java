package collection_works.set_works;

import java.util.HashSet;
import java.util.Spliterator;
import java.util.function.Predicate;

public class HashSetWorks {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("bro bro bro");
        hs.add("show show show");
        hs.add("do this this ");
        hs.add("bro");
        hs.add("bro");
        hs.add("bull");
        hs.add("null");
        hs.add(null);
        System.out.println(hs);
        Object[] oa = hs.toArray();
        System.out.println(oa[2]);

    }

}
