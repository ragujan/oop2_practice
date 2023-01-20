package collection_works.list_works;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorWorks {
    public static void main(String[] args) {
        ArrayList<Integer> abc = new ArrayList<Integer>();
        Vector v = new Vector<>();
        for (int i = 0; i <10 ; i++) {
           v.add(333) ;
        }
        v.addElement(9);
        v.addElement(123);
        v.add(345);
        Object[] ob = new Object[v.size()];
        v.copyInto(ob);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println(v.elementAt(v.size()-3));
        System.out.println(v.elements().hasMoreElements());
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
