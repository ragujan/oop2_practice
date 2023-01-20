package practice.question_4;

public class A {
    public static void main(String[] args) {
        String name = "123456789V";
        System.out.println("Before");
        try{
           char ch = name.charAt(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After");
    }
}
