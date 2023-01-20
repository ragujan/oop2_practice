package collection_works.queue_works;

import java.util.PriorityQueue;

public class PriorityQueueWorks {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("A");
        pq.add("B");
        pq.add("Y");
        pq.add("X");
        pq.add("P");
        pq.add("R");
        pq.add("L");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq);
        System.out.println(pq);
       PriorityQueue<Integer> i = new PriorityQueue<>();
       i.add(22);
       i.add(2);
       i.add(30);
       i.add(100);
       i.add(4);
        System.out.println(i);
        System.out.println(i.peek());
    }
}
