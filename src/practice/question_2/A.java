package practice.question_2;

public class A {
    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL
    }

    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s);

        String day = "MONDAY";
        Test t = new Test(Day.valueOf(day));
        t.dayIsLike();

    }
}

//enum Color{
//    RED,
//    GREEN,
//    BLUE;
//}

class Color {
    public static final Color RED = new Color();
    public static final Color BLUE = new Color();
    public static final Color GREEN = new Color();
}

enum  Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
class Test{
    Day day;

    public Test(Day day ){
        this.day = day;
    }

    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}