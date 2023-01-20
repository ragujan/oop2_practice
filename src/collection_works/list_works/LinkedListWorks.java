package collection_works.list_works;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListWorks {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("bro");
        list.add("tro");
        list.add("wro");
        list.add("rro");
        list.add("llo");
        String[] names = new String[list.size()];
        list.toArray(names);
        System.out.println(names[0]);
        list.clear();
        System.out.println(list.size());
        list = new LinkedList<>(Arrays.asList(names));
        list.stream().forEach(e-> System.out.println(e));

    }
}