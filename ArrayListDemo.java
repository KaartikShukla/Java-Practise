import java.util.*;
class Student{
    int roll_no;
    String name;
    Student(int roll_no,String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    
    public String toString(){
        return "["+ this.name + " " + this.roll_no + "]";
    }
}
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        //Integer is a class so 7 will get stored in it by the concept of "Autoboxing"
        //list.add(Integer.valueof(7)) this is automatically boxed 
        list.add(7);
        list.add(9);
        System.out.println(list.get(1));
        list.add(1,5);
        System.out.println(list);
        list.set(1,6);
        System.out.println(list);
        //list.addFirst(10);
        //list.addLast(20);
        List<Integer> lis = new ArrayList<>();
        lis.add(2);
        lis.add(3);
        System.out.println(lis.get(1));
        lis.add(1,4);
        System.out.println(lis);
        lis.set(1,5);
        System.out.println(lis);
        //list.addFirst(10);
        //list.addLast(20);
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1,"Raj"));
        list2.add(new Student(2,"Rajesh"));
        System.out.println(list2);
    }
}
