package model_paper;

public class Q8 {
    public static void main(String[] args) {
        try{
           int x = 10/0;

        }catch (ArithmeticException ex){
            System.out.println("Arithmatic Exception");
        }
    }
}
