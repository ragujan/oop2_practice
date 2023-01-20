package practice.question_3;

public class TripleDotArgument {
    static void varMeth(int... z){
        for(int y:z){
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        varMeth(10,50);
        varMeth(new int[]{44,55,5,6,6,332});
        varMeth(33,44,222);
    }


}
