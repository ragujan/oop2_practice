package practice.question_3;

public class A {
    static void varMeth(int... z){
        System.out.println("Var arg method");
    }
    static void varMeth(int x){
        System.out.println("int method");
    }
    static void varMeth(Integer y){
        System.out.println("Integer method");
    }
    public static void main(String[]args){
        varMeth(10);
    }

}
