package collection_works.list_works;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListWorks {
    public static void main(String[] args) {
        List<String> baba = new LinkedList<>();
        baba.add("13433");
        baba.add("23433");
        baba.add("33433");
        baba.add("43433");

        ArrayList<String> ara = new ArrayList<>();
        ara.add("bro");
        ara.add("bro");
        ara.add("bro");
        ara.add("bro");
        ara.add("bro");
        ara.addAll(2,baba);
        System.out.println(ara);
    }

}
