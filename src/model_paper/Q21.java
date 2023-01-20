package model_paper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q21 {
    public static void main(String args[]) {
        ArrayList<A3> ar = new ArrayList<A3>();
        ar.add(new A3(34));
        ar.add(new A3(74));
        ar.add(new A3(64));
        ar.add(new A3(44));
        ar.add(new A3(54));
        ar.add(new A3(24));
        System.out.println(ar);
        Collections.sort(ar, new MyComp());
        System.out.println(ar);
    }

}

class A3 {
    int a;

    A3(int i) {
        a = i;
    }

    public String toString() {
        return Integer.toString(a);
    }
}

class MyComp implements Comparator<A3> {
    public int compare(A3 r1, A3 r2) {
        if (r1.a > r2.a) return 1;
        else if (r1.a < r2.a) return -1;
        else return 0;
    }
}
