package model_paper;

import java.util.TreeSet;

public class Q7 {
    public static void main(String[] args) {
        TreeSet<DVD> ss = new TreeSet();
        System.out.println(ss);
    }
}
class DVD{
   String name;

   DVD(String name){
       this.name = name;
   }
}
