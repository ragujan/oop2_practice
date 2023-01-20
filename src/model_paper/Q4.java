package model_paper;

public class Q4 {
    public static void main(String[] args) {
        StringBuffer f = new StringBuffer("AA");
        StringBuffer f2 = new StringBuffer("AA");
        String s = new String("A");
        String s1 = new String("A");
        System.out.println(s.equals(s1));
        System.out.println(f.equals(f2));

        StringBuffer f3 = new StringBuffer("AA");
        StringBuffer f4 = f3;
        System.out.println(f4==f3);
        System.out.println(f4.equals(f3));
    }
}
