package practice.question_7;

public class A {
    public static void main(String[] args) {
        int x=0,d=0;

        try {
            d = 42/0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index error");
        }finally {
            System.out.println("Finally");
        }
        System.out.println("After");
    }
}
