package model_paper;

public class Q33 {
    public static void main(String[] args) {


        Float f1 = new Float(34) ;
        Float f2 = new Float(f1/0);
        //isInfinite will return true for infinity values
        System.out.println(f2+" value for isInfinite() method is : " +Float.isInfinite(f2));
        System.out.println(f1+" value for Finite() method : "+Float.isFinite(f1));
        //converting float into int
        int f3=f1.intValue()*f2.intValue();
        System.out.println(f2);
        System.out.println("Infinity to int "+f2.intValue());
        System.out.println("intValue() method will return : "+f1+"*"+f2+" = "+f3 );
        // hash code of float value f1
        int f4 = f1.hashCode();
        System.out.println("Hash code value of "+f1+ " is : "+f4);

    }
}
