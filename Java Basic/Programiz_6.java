import java.util.*;
public class Programiz_6 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // with temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

        // without temp variable
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println(a+" "+b);

    }
}
