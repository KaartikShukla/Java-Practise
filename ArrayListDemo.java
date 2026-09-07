import java.util.*;
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
    }
}
