package collection_works.queue_works;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LInkedListWorks {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.add(5);
        System.out.println("Peek is "+integers.peek());
        System.out.println(integers);
        System.out.println("Removign head "+integers.poll());

        System.out.println(integers);
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
           list.add(i);
        }
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
