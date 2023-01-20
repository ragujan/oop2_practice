package model_paper;

public class Q11 {
    static void varMeth(int...z){
        System.out.println("var arg method");
    }
    static void varMeth(int x){
        System.out.println("int method");
    }
    static void varMeth(Integer y){
        System.out.println("Integer method");
    }

    public static void main(String[] args) {
        int[] i = {11,22,33,4};
        Integer integer = 33;
        varMeth(10);
        varMeth(i);
        varMeth(integer);
    }
}
