package practice.question_2;

public class With_Values {
    public static void main(String[] args) {
        Fruits[] fruits = Fruits.values();
        for (Fruits fruit:fruits) {
            System.out.println(fruit.getColor()+" size is "+fruit.getSize());
            System.out.println(fruit.ordinal());
        }
    }

}

enum Fruits{
   APPLE("RED","LARGE"),BANANA("YELLOW","MEDIUM") ,GRAPES("GREEN","SMALL");

   private String size;
   private String color;
   private Fruits(String color,String size){
       this.color = color;
       this.size = size;
   }
   public String getColor(){
       return this.color;
   }
   public String getSize(){
       return this.size;
   }
}
