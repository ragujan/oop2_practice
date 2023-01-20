package model_paper;

public class Q15 {
    public static void main(String[] args) {
        int x = 0,d=0;
        try{

            d = 42/0;
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic exceptoin");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("After");

    }
}
