package practice.question_5;

public class A {
    boolean abandonAllHope;
    public void takeRisk() throws BadException{
        if(!abandonAllHope){
            throw new BadException();
        }
    }
    public static void main(String[] args) {
        A a = new A();
        a.abandonAllHope = false;
        try{
            a.takeRisk();
        }catch (BadException e){
           e.sayBadMessage();
        }
    }
}
class BadException extends Exception{
    public void sayBadMessage(){
        System.out.println("Fuck this bro you are doomed");
    }
}
