package collection_works.random_test;

public class TestPrimitiveWorks {
    public static void main(String[] args) {
        byte a = 127;
        int e = 128;
        byte b2 = (byte) (e*a);
        System.out.println(b2);
        short s1 = 32767;
        short s2 = (short) (s1*s1);
        System.out.println(s2);
        System.out.println("///////////");


    }
    public void powerMaker(int power){
        int powerOne = 10;
        int totalPower =1;
        for (int i = 0; i <4 ; i++) {
           totalPower = powerOne*i;
        }
        System.out.println(totalPower);
    }
}
