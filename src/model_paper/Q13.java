package model_paper;

public class Q13 {
    boolean abandonAllHopes;
    public static void main(String[] args){
        System.out.println("B4");
        Q13 d = new Q13();
        try {
            d.riskyMethod();
        } catch (MyException e) {
           e.throwing();
        }


    }
    public void riskyMethod ()throws MyException{
       if(!abandonAllHopes){
           throw new MyException();
       }
    }
}
class MyException extends  Exception{
    public void throwing(){
        System.out.println("MyException");
    }
}