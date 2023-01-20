package collection_works.random_test;

import java.util.Arrays;

public class ComparableWorks {
    public static void main(String[] args) {
        int n = 4;
        Pair[] arr = new Pair[n];

        arr[0] = new Pair("abc",3);
        arr[1] = new Pair("a",4);
        arr[2] = new Pair("bc",5);
        arr[3] = new Pair("a",2);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(Pair[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


class Pair implements Comparable<Pair>{
    String string;
    int y ;
    public Pair(String x, int y){
        this.string = x;
        this.y = y;
    }
    public String toString(){
        return "("+ string +","+y+")";
    }
   @Override
   public int compareTo(Pair a){
       if(this.string.compareTo(a.string) !=0){
           return this.string.compareTo(a.string);
       }else{
           return this.y - a.y;
       }
   }
}
