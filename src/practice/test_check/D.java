package practice.test_check;

public class D  {
    public static void main(String[] args) {
        E e = new F();
        e.dodo();

    }
}
class E{
   public void dodo(){
        System.out.println("HEY EHY");
    }

}
class F extends E{
    public void booboo(){
        System.out.println("BOO BOO");
    }

}