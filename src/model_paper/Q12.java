package model_paper;

public class Q12 {
    public static void main(String[] args) {
        String name = "123456789V";
        System.out.println("Before");
        try{
           char ch =name.charAt(10);
        }catch (Exception ex){
            System.out.println("Runtime error");
        }
        System.out.println("After");
    }
}
