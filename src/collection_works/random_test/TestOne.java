package collection_works.random_test;

import java.util.LinkedList;
import java.util.List;

public class TestOne {

    List<String> list ;
    public static void main(String[] args) {
        TestOne t = new TestOne();
        t.list = new LinkedList<>();
        List<String> l1 = t.list;
        t.list.add("rag");
        System.out.println(t.list.size());
        System.out.println(l1.size());
    }
}
