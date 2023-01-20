package collection_works.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);


        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        System.out.println("Before sorting ");
        al.forEach(a-> System.out.println(a));
        Collections.sort(al,new Student.CustomerSortingComparator());
        System.out.println("After sorting ");
        al.forEach(a-> System.out.println(a));
    }
}

class Student{
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   static class CustomerSortingComparator implements Comparator<Student> {

       @Override
       public int compare(Student student1, Student student2) {
           System.out.println("comparing between "+student1.getName()+" age "+student1.getAge()+" "+student2.getName()+" age "+student2.getAge());
           int nameCompare = student1.getName().compareTo(student2.getName());
           int ageCompare = student1.getAge().compareTo(student2.getAge());
           System.out.println("name compare is "+nameCompare);
           System.out.println("age compare is "+ageCompare);
           int returningCompareValue = 0;
           if(nameCompare == 0){
              returningCompareValue = ageCompare;
           }else{
               returningCompareValue = nameCompare;
           }
           return returningCompareValue;
       }
   }
    String name;
    int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }


}