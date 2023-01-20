package model_paper;

import java.util.TreeMap;

public class Q20 {
    public static void main(String[] args) {
        TreeMap obj = new TreeMap();
        obj.put("D",new Integer(1));
        obj.put("A",new Integer(0));
        obj.put("B",new Integer(2));
        obj.put("C",new Integer(3));
        System.out.println(obj.entrySet());
    }
}
