package model_paper;

public class Q40 {
    public static void main(String[] args) {
        Q40 q = new Q40();
     int x = 90;
     try{
         q.takeRisk(x);
     }catch (ExceptionRag rag){
         rag.throwRagException();
     }finally {
         System.out.println("finally");
     }
    }
    public void takeRisk(int x) throws ExceptionRag {
       if(x !=50){
          throw new ExceptionRag();
       }
    }
}
class ExceptionRag extends Exception{
    public void throwRagException(){
        System.out.println("My Exception");
    }

}