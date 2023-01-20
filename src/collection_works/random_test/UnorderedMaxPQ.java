package collection_works.random_test;

public class UnorderedMaxPQ <Key extends Comparable<Key>>{
    private Key[] pq;
    private int N;
    public UnorderedMaxPQ(int capacity){
        pq = (Key[]) new Comparable[capacity];
        N = 0;
    }
}
