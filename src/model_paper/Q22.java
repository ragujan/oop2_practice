package model_paper;

import org.w3c.dom.ls.LSOutput;

public class Q22 {
    final class B{
        public static void main(String[] args) {
            System.out.println("HEY");
        }
    }
    public static void heyBro(){
        System.out.println("Hey Bro");
    }
    class ABC{
        public void doThis(){
            System.out.println("Do this");
        }
    }

}
class Test22{

    public static void main(String[] args) {
        System.out.println("dont't hurt me no more ");
        Q22.B.main(new String[3]);
        Q22.ABC abc = new Q22().new ABC();
        abc.doThis();

        Runnable heyBro = Q22::heyBro;

    }
}
